/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package prioritydemo;

/**
 *
 * @author Ramezani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleThread th=new SimpleThread();
        th.setName("th");
        th.setPriority(10);
        SimpleThread tl=new SimpleThread();
        tl.setName("tl");
        tl.setPriority(1);
        th.start();
        tl.start();
        try
        {
            Thread.sleep(3000);
        }
        catch(InterruptedException ex)
        {
            System.out.println(ex.getMessage());
        }
        System.out.println(th.Counter);
        System.out.println(tl.Counter);
    }

}
