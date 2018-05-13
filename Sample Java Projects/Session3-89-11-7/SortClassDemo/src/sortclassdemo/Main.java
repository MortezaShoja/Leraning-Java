/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sortclassdemo;

import java.util.Arrays;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee[]ea=new Employee[3];
        ea[0]=new Employee("b", "c");
        ea[1]=new Employee("b", "a");
        ea[2]=new Employee("a", "d");
        Arrays.sort(ea);
        for(Employee emp:ea)
        {
            System.out.println(emp);
        }
    }

}
