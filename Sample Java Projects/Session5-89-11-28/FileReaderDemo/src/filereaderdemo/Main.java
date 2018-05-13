/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package filereaderdemo;

import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            FileReader r=new FileReader("D:\\File.txt");
            while(r.ready())
            {
                System.out.print((char)r.read());
            }
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
