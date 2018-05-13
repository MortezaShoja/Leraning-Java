/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package drivesdemo;

import java.io.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(File Drive:File.listRoots())
        {
            System.out.println(Drive.getAbsolutePath());
            System.out.println(Drive.getFreeSpace());
        }
    }

}
