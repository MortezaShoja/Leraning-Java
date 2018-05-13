/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mycomparedemo;

/**
 *
 * @author Ramezani
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer[]ia=new Integer[3];
        ia[0]=10;
        ia[1]=5;
        ia[2]=7;
        Arrays.sort(ia,new  MyComparator());
        for(Integer ip:ia)
        {
            System.out.println(ip);
        }
        
    }

}
