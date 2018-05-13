/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classsortdemo;

/**
 *
 * @author Ramezani
 */
public class Employee implements Comparable {
    public String Family;
    public String Name;

    @Override
    public String toString()
    {
        return String.format("%s-%s", Family,Name);
    }

    public int compareTo(Object other)
    {
        Employee emp=(Employee)other;
        if(this.Family.equals(emp.Family))
            return this.Name.compareTo(emp.Name);
        else
            return this.Family.compareTo(emp.Family);
    }
}
