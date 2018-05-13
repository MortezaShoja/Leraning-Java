/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package comparatordemo;
import java.util.Arrays;
import java.util.*;
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
        Integer[]ia=new Integer[3];
        ia[0]=10;
        ia[1]=5;
        ia[2]=100;
        Comparator<Integer> c=new DescComparator();
        Arrays.sort(ia,c);
        for(Integer ip:ia)
        {
            System.out.println(ip);
        }
    }



}
