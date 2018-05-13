/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package logindemo;

import java.io.*;
import javax.swing.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            String username=JOptionPane.showInputDialog("Username : ");
            String password=JOptionPane.showInputDialog("Password : ");
            Boolean find=false;
            FileReader f=new FileReader("D:\\Users.txt");
            BufferedReader r=new BufferedReader(f);
            while(r.ready())
            {
                String[]info=r.readLine().split(",");
                if(info[0].equals(username)&&info[1].equals(password))
                {
                    find=true;
                    break;
                }
            }
            r.close();
            f.close();
            if(find)
                JOptionPane.showMessageDialog(null, "Correct");
            else
                JOptionPane.showMessageDialog(null, "Invalid !");
        }
        catch(FileNotFoundException ex1)
        {
            System.out.println(ex1.getMessage());
        }
        catch(IOException ex2)
        {
            System.out.println(ex2.getMessage());
        }
    }

}
