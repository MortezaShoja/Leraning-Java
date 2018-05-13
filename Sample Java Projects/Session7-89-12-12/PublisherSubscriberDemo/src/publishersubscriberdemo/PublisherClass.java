/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package publishersubscriberdemo;

import java.io.*;
import java.util.*;

public class PublisherClass extends Thread {

    @Override
    public void run() {
        try
        {
            FileWriter w=new FileWriter("D:\\File.txt");
            w.write(new Random().nextInt(28)+97);
            Thread.sleep(new Random().nextInt(3000));
            w.close();
        }
        catch(IOException ex1)
        {
            System.out.println(ex1.getMessage());
        }
        catch(InterruptedException ex2)
        {
            System.out.println(ex2.getMessage());
        }
        
    }
}
