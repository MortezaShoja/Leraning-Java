/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newrmiclientdemo;

import java.net.MalformedURLException;
import java.rmi.*;
import java.util.Scanner;
import newrmiserverdemo.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            PowerService srv=(PowerService)Naming.lookup("rmi://localhost/PowerService");
            //System.out.println(srv.power(2, 5));
            Scanner s=new Scanner(System.in);
            while(true)
            {
                System.out.print("Message : ");
                srv.send("Me",s.nextLine());
                for(Message m:srv.receive())
                {
                    System.out.println(String.format("%s:%s",m.Sender,m.Body));
                }
            }
        }
        catch(MalformedURLException ex1)
        {
            System.out.println(ex1.getMessage());
        }
        catch(NotBoundException ex2)
        {
            System.out.println(ex2.getMessage());
        }
        catch(RemoteException ex3)
        {
            System.out.println(ex3.getMessage());
        }
    }

}
