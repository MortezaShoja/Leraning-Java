/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package foreachdemo;

/**
 *
 * @author Ramezani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]ia=new int[3];
        ia[0]=10;
        ia[1]=5;
        ia[2]=20;
        for(int ip:ia)
        {
            ip=ip*2;
        }
    }

}
