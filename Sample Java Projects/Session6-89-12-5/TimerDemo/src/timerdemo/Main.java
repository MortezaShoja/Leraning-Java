/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package timerdemo;

import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Timer t=new Timer();
        t.scheduleAtFixedRate(new MyTask(), 1   , 1000);
    }
}
