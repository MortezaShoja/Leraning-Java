/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package mycomparedemo;
import java.util.*;
/**
 *
 * @author Ramezani
 */
public class MyComparator implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        //return o1.compareTo(o2);
        return o2.compareTo(o1);
    }

}
