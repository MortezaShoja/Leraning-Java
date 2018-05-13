/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newrmiserverdemo;

import java.rmi.*;
import java.util.ArrayList;

public interface PowerService extends Remote
{
    public double power(double num,double po)throws RemoteException;
    public void send(String sender,String body)throws RemoteException;
    public ArrayList<Message> receive()throws RemoteException;
}
