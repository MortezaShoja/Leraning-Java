/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sortclassdemo;

/**
 *
 * @author Ramezani
 */
public class Employee implements Comparable
{
    public String Family;
    public String Name;

    public Employee(String argFamily,String argName)
    {
        Family=argFamily;
        Name=argName;
    }

    @Override
    public String toString()
    {
        return String.format("%s-%s", Family,Name);
    }

    public int compareTo(Object o) {
        Employee other=(Employee)o;
        if(this.Family.equals(other.Family))
            return this.Name.compareTo(other.Name);
        else
            return this.Family.compareTo(other.Family);
    }

    
}
