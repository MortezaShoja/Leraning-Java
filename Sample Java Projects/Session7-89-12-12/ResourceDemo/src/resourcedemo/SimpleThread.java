/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package resourcedemo;


public class SimpleThread extends Thread {

    public ResourceClass Resource;

    @Override
    public void run() {
        Resource.setFlag();
    }

}
