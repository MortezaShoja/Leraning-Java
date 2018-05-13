/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package recursivefactorialdemo;

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
        System.out.println(f(7));
    }

    static int f(int n)
    {
        if(n==0)
            return 1;
        else
        {
            System.out.println(String.format("%d * f(%d-1)",n,n));
            return n*f(n-1);
        }
    }

}
