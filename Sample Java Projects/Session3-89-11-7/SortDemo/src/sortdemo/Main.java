/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sortdemo;

import java.util.Arrays;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]ia=new int[10];
        for(int i=0;i<ia.length;i++)
        {
            ia[i]=(int)(Math.random()*100+10);
        }
        for(int ip:ia)
        {
            System.out.println(ip);
        }
        System.out.println("----------");
        Arrays.sort(ia);
        for(int ip:ia)
        {
            System.out.println(ip);
        }
    }

}
