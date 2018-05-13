/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package demo;

import java.util.*;
import javax.swing.JLabel;

public class MyTask extends TimerTask {
    public int Start=10;
    public JLabel ShowLabel=null;

    @Override
    public void run() {
        Start--;
        ShowLabel.setText(String.valueOf(Start));
    }
}
