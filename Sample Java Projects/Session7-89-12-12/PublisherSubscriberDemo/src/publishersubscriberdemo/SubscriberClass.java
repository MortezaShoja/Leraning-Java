/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package publishersubscriberdemo;

import java.io.*;

public class SubscriberClass extends Thread {

    @Override
    public void run() {
        try
        {
            FileReader r=new FileReader("D:\\File.txt");
            BufferedReader b=new BufferedReader(r);
            System.out.println(b.readLine());
            r.close();
            b.close();
        }
        catch(IOException ex1)
        {
            System.out.println(ex1.getMessage());
        }
    }
}
