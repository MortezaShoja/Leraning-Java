/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package finddemo;

import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[]sa=new String[3];
        sa[0]="Java";
        sa[1]="JSP";
        sa[2]="XML";
        while(true)
        {
            String NewMember=JOptionPane.showInputDialog("Find : ");
            boolean b=false;
            for(int i=0;i<sa.length;i++)
            {
                if(sa[i].equals(NewMember))
                {
                    b=true;
                    break;
                }
            }
            if(b)
                JOptionPane.showMessageDialog(null, "Exists");
            else
                JOptionPane.showMessageDialog(null, "Not Exists !");
        }
    }

}
