/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package substringdemo;

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
        String s="sample";
        System.out.println(s.substring(3));
        System.out.println(s.substring(s.length()-1));
        System.out.println(s.substring(0,1));
        System.out.println(s.substring(1,1));
        System.out.println(s.substring(1,2));
    }

}
