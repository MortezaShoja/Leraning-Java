/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rmiserverdemo;

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class PowerServiceServer extends UnicastRemoteObject implements PowerService {

    public double power(double num, double po) throws RemoteException {
        return Math.pow(num, po);
    }

    public PowerServiceServer() throws RemoteException{
        super();
    }
    
    public static void main(String[] args) {
        try
        {
            PowerServiceServer srv=new PowerServiceServer();
            Naming.bind("rmi://localhost:1099/PowerService", srv);
            System.out.println("Service Bounded...");
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
