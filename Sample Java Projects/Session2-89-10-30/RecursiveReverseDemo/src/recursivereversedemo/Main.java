/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package recursivereversedemo;

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
        while(true)
        {
            String s=JOptionPane.showInputDialog("Word : ");
            JOptionPane.showMessageDialog(null, r(s));
        }
    }

    static String r(String s)
    {
        if(s.length()==0)
            return "";
        else if(s.length()==1)
            return s;
        else
            return s.substring(s.length()-1)+r(s.substring(1,s.length()-1))+s.substring(0,1);
    }
}
