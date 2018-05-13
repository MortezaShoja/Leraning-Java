/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package publishersubscriberdemo;

/**
 *
 * @author Ramezani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        while(true)
        {
            try
            {
                PublisherClass p=new PublisherClass();
                SubscriberClass s=new SubscriberClass();
                p.start();
                p.join();
                s.start();
                s.join();
            }
            catch(InterruptedException ex)
            {
                System.out.println(ex.getMessage());
                return;
            }
        }
    }

}
