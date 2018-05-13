/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package employeedescdemo;

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
        Employee[]emp=new Employee[3];
        emp[0]=new Employee("b", "z");
        emp[1]=new Employee("b", "a");
        emp[2]=new Employee("a", "b");
        Arrays.sort(emp, new EmployeeDescComparator());
        for(Employee e:emp)
        {
            System.out.println(e.toString());
        }
    }

}
