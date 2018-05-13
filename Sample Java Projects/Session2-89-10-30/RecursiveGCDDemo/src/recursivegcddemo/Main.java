/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package recursivegcddemo;

/**
 *
 * @author Ramezani
 */
import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(gcd(32,24));
        //System.out.println(gcd(24,32));
        String si=JOptionPane.showInputDialog("First Number : ");
        String sj=JOptionPane.showInputDialog("Second Number : ");
        int i=Integer.parseInt(si);
        int j=Integer.parseInt(sj);
        System.out.println(gcd(i,j));
        JOptionPane.showMessageDialog(null, gcd(i,j));
    }

    static int gcd(int i,int j)
    {
        if(i%j==0)
            return j;
        else
            return gcd(j,i%j);
    }

}
