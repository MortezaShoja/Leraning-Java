package comparatordemo;

import java.util.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ramezani
 */
/*
public class DescComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        int a=Integer.parseInt(o1.toString());
        int b=Integer.parseInt(o2.toString());
        if(a==b)
            return 0;
        else if(a>b)
            return 1;
        else
            return -1;
    }
}
 * 
 */
public class DescComparator implements Comparator<Integer> {

    public int compare(Integer o1, Integer o2) {
        //return o1.compareTo(o2);
        return o2.compareTo(o1);
    }
}