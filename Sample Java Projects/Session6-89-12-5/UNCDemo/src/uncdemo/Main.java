/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package uncdemo;

import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try       
        {
            FileReader f=new FileReader("\\\\192.168.255.164\\AppData\\Users.txt");
            BufferedReader r=new BufferedReader(f);
            while(r.ready())
            {
                System.out.println(r.readLine());
            }
            r.close();
            f.close();
        }
        catch(FileNotFoundException ex1)
        {
            System.out.println(ex1.getMessage());
        }
        catch(IOException ex2)
        {
            System.out.print(ex2.getMessage());
        }
    }

}
