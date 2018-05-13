/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package randomarraydemo;

import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count=Integer.parseInt(JOptionPane.showInputDialog("Numbers Count ? "));
        int[]ia=new int[count];
        for(int i=0;i<ia.length;i++)
        {
            ia[i]=(int)((Math.random()*90)+10);
        }
        for(int ip:ia)
        {
            System.out.println(ip);
        }
    }

}
