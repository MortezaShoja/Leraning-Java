/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package classsortdemo;

import java.util.Arrays;
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
        Employee e1=new Employee();
        e1.Family="b";
        e1.Name="z";
        Employee e2=new Employee();
        e2.Family="b";
        e2.Name="a";   
        Employee e3=new Employee();
        e3.Family="a";
        e3.Name="f";
        Employee[]ea=new Employee[]{e1,e2,e3};
        Arrays.sort(ea);
        for(int i=0;i<ea.length;i++)
            System.out.println(ea[i].toString());
    }

}
