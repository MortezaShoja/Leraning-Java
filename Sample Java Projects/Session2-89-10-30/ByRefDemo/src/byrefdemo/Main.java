/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package byrefdemo;

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
        MyClass m=new MyClass();
        m.Number=10;
        inc(m);
        System.out.println(m.Number);
    }

    static void inc(MyClass c)
    {
        c.Number++;
    }

}
