/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package listdemo;

import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f=new File("C:\\");
        for(String sp:f.list())
        {
            //System.out.println(sp);
            //System.out.println(String.format("C:\\%s", sp));
            File InnerFile=new File(String.format("C:\\%s", sp));
            if(InnerFile.isFile())
                System.out.println(String.format("File : %s",sp));
            if(InnerFile.isDirectory())
                System.out.println(String.format("Directory : %s",sp));
        }
    }

}
