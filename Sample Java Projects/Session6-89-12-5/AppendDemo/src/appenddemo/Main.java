/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package appenddemo;

import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            FileWriter f=new FileWriter("D:\\YourFile.txt",true);
            f.write("Test");
            f.write("\r\n");
            f.close();
        }
        catch(IOException ex1)
        {
            System.out.println(ex1.getMessage());
        }
    }

}
