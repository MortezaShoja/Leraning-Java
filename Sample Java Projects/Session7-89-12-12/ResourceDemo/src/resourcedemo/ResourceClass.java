/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package resourcedemo;

import javax.swing.JOptionPane;

/**
 *
 * @author Ramezani
 */
public class ResourceClass {
    
    boolean Flag=false;
    
    public synchronized void setFlag()
    {
        if(!Flag)
        {
            //System.out.println("------------");
            
            //System.out.print(Thread.currentThread().getName());
            //System.out.print("->");
            System.out.println("Changed");
            //System.out.println("------------");
            Flag=true;
            JOptionPane.showMessageDialog(null, "Input ? ");
        }
    }

}
