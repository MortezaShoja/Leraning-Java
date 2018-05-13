/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newrmiserverdemo;

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class PowerServiceServer extends UnicastRemoteObject implements PowerService {

    ArrayList _messages=null;


    public double power(double num, double po) throws RemoteException {
        return Math.pow(num, po);
    }

    public void send(String sender, String body) throws RemoteException {
        _messages.add(new Message(sender,body));
    }

    public ArrayList<Message> receive() throws RemoteException {
        return _messages;
    }



    public PowerServiceServer() throws RemoteException {
        super();
        _messages=new ArrayList();
    }

    public static void main(String[] args) {
        try
        {
            PowerServiceServer srv=new PowerServiceServer();
            Naming.bind("rmi://localhost:1099/PowerService", srv);
            System.out.println("Service Bound...");
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
}
