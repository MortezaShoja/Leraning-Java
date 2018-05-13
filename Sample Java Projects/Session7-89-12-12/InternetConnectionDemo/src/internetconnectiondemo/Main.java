/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package internetconnectiondemo;

import java.net.*;
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            URL u=new URL("http://www.yahoo.com");
            HttpURLConnection c=(HttpURLConnection)u.openConnection();
            System.out.println(c.getResponseMessage());
        }
        catch(MalformedURLException ex1)
        {
            System.out.println(ex1.getMessage());
        }
        catch(IOException ex2)
        {
            System.out.println(ex2.getMessage());
        }
    }

}
