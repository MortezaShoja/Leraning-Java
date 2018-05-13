/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sortdemo;

import java.util.Arrays;

/**
 *
 * @author Ramezani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[]ia=new int[3];
        ia[0]=10;
        ia[1]=5;
        ia[2]=7;
        Arrays.sort(ia);
        for(int i=0;i<ia.length;i++)
            System.out.println(ia[i]);
    }

}
