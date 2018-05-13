/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package splitdemo;

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
        String s="admin,123,2011/3/24";
        String[]sa=s.split(",");
        for(String sp:sa)
        {
            System.out.println(sp);
        }
    }

}
