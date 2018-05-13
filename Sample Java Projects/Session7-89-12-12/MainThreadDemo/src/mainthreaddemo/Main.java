/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mainthreaddemo;

import java.lang.*;
import java.net.*;
import java.io.*;
import sun.net.www.protocol.https.AbstractDelegateHttpsURLConnection;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        t.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t.getPriority());
    }

}
