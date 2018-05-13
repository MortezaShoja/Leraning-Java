/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package threadextendsdemo;

import java.lang.*;

public class ExtendsThreadClass extends Thread {

    @Override
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
