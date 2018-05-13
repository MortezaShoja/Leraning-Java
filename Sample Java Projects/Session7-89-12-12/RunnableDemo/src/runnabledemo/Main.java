/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package runnabledemo;

import java.lang.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t=new Thread(new RunnableThreadClass());
        t.start();
    }

}
