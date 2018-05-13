/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inputstreamdemo;

import java.net.*;
import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while(true)
        {
        try
        {
            URL u=new URL("http://localhost");
            HttpURLConnection c=(HttpURLConnection)u.openConnection();
            InputStream s=c.getInputStream();
            int i=s.read();
            while(i!=-1)
            {
                System.out.print((char)i);
                i=s.read();
            }
            s.close();
            c.disconnect();
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
}