/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package messagingrmiserverdemo;

import java.rmi.*;

public interface MessagingService extends Remote
{
    public void send(String argSender,String argBody)throws RemoteException;
    public String[]receive()throws RemoteException;
}
