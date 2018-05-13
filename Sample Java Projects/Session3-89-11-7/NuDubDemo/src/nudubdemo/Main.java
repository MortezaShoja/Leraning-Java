/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nudubdemo;

/**
 *
 * @author Ramezani
 */
import javax.swing.JOptionPane;

public class Main {


    
    public static void main(String[] args) {
        
    int min=Integer.parseInt(JOptionPane.showInputDialog("Minimum : "));
    int max=Integer.parseInt(JOptionPane.showInputDialog("Maximum : "));
    int count=Integer.parseInt(JOptionPane.showInputDialog("Count : "));
    
    int[]domain=new int[max-min+1];
    for(int i=0;i<domain.length;i++)
    {
        domain[i]=min++;
    }
    for(int i=0;i<count;i++)
    {
        int index=(int)((Math.random()*(domain.length-1-i)));
        System.out.println(domain[index]);
        domain[index]=domain[domain.length-1-i];
    }
    }

}
