/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arraylistdemo;

/**
 *
 * @author Ramezani
 */
import java.util.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

    /**
     * @param args the command line arguments
     */
    

    
    public static void main(String[] args) {
     ArrayList<String>List=new ArrayList<String>();  
        while(true)
        {
            String NewMember=JOptionPane.showInputDialog("New Member : ");
            List.add(NewMember);
            for(String sp:List)
            {
                System.out.println(sp);
            }
            System.out.println("------------");
        }
    }

}
