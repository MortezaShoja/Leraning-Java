/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package employeedescdemo;

/**
 *
 * @author Ramezani
 */
public class Employee {
    String Family="";
    String Name="";

    public Employee(String argFamily,String argName) {
        Family=argFamily;
        Name=argName;
    }

    @Override
    public String toString()
    {
        return String.format("%s-%s", Family,Name);
    }
}
