/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package messagingrmiserverdemo;

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class MessagingServiceServer extends UnicastRemoteObject implements MessagingService {

    ArrayList<Message> _Messages=null;

    public MessagingServiceServer() throws RemoteException{
        super();
        _Messages=new ArrayList<Message>();
    }

    public static void main(String[] args) {
        try
        {
            MessagingServiceServer srv=new MessagingServiceServer();
            Naming.bind("rmi://localhost/MessagingService", srv);
            System.out.println("Messaging Service Bound...");
        }
        catch(AlreadyBoundException ex1)
        {
            System.out.println(ex1.getMessage());
        }
        catch(MalformedURLException ex2)
        {
            System.out.println(ex2.getMessage());
        }
        catch(RemoteException ex3)
        {
            System.out.println(ex3.getMessage());
        }
    }

    public void send(String argSender, String argBody) throws RemoteException {
        _Messages.add(new Message(argSender, argBody));
    }

    public String[] receive() throws RemoteException {
        String[]result=new String[_Messages.size()];
        int index=0;
        for(Message m:_Messages)
        {
            result[index++]=String.format("%s:%s",m.Sender,m.Body);
        }
        return result;
    }

}
