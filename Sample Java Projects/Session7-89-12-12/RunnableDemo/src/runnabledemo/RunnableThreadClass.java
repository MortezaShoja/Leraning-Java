/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package runnabledemo;

import java.lang.*;

public class RunnableThreadClass implements Runnable {

    public void run() {
        while(true)
        {
            System.out.println("Thread Is Running...");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }

}
