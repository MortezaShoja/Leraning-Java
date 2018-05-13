/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package filenamefilterdemo;

import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f=new File("C:\\");
        for(String sp:f.list(new TextFilter()))
        {
            System.out.println(sp);
        }
    }

}
