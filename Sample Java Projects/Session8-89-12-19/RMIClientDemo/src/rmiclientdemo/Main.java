/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rmiclientdemo;

import java.net.MalformedURLException;
import java.rmi.*;
import rmiserverdemo.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            PowerService srv=(PowerService)Naming.lookup("rmi://localhost/PowerService");
            System.out.println(srv.power(2, 3));
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
