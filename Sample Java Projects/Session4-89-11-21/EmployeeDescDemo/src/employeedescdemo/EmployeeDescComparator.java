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

public class EmployeeDescComparator implements Comparator<Employee> {

    public int compare(Employee o1, Employee o2) {
        if(o2.Family.equals(o1.Family))
            return o2.Name.compareTo(o1.Name);
        else
            return o2.Family.compareTo(o1.Family);
    }

}
