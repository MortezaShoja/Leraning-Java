/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inputbounddemo;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count=Integer.parseInt(JOptionPane.showInputDialog("Members Count ? "));
        String[]sa=new String[count];
        for(int i=0;i<sa.length;i++)
        {
            sa[i]=JOptionPane.showInputDialog(String.format("Enter Member Number %d",i+1));
        }
        for(String sp:sa)
        {
            System.out.println(sp);
        }
    }

}
