/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package simplearraydemo;

import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[]sa=new String[3];
        sa[0]=(String)JOptionPane.showInputDialog("First Member : ");
        sa[1]=(String)JOptionPane.showInputDialog("Second Member : ");
        sa[2]=(String)JOptionPane.showInputDialog("Third Member : ");
        /*
        System.out.println(sa[0]);
        System.out.println(sa[1]);
        System.out.println(sa[2]);
         */
        /*
         for(int i=0;i<sa.length;i++)
         {
            System.out.println(sa[i]);
         }
         */
        for(String sp:sa)
        {
            System.out.println(sp);
        }
    }

}
