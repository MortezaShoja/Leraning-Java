/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package byvaluedemo;

/**
 *
 * @author Ramezani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=10;
        inc(a);
        System.out.println(a);
    }

    static void inc(int i)
    {
        i++;
        System.out.println(i);
    }
}
