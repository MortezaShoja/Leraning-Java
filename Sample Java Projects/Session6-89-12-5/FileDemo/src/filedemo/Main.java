/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package filedemo;

import java.io.*;


public class Main {

    /**1298621567750
     * 1298622318671
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f=new File("\\\\192.168.255.164\\AppData\\Data.txt");
        System.out.println(f.lastModified());
    }

}
