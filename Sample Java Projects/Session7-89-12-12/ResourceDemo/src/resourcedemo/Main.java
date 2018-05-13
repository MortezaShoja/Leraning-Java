/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package resourcedemo;

/**
 *
 * @author Ramezani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
{
        SimpleThread t1=new SimpleThread();
        t1.setName("t1");
        SimpleThread t2=new SimpleThread();
        t2.setName("t2");
        ResourceClass r=new ResourceClass();

        t1.Resource=r;
        t2.Resource=r;

        t1.start();
        t2.start();
     
}
catch(Exception ex)
{
    String s=ex.getMessage();

}


    }

}