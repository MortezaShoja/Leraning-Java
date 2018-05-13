/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package reversedemo;

/**
 *
 * @author Ramezani
 */import java.util.*;
import javax.swing.JLabel;
public class MyTask extends TimerTask {

    public int Start=10;
    public JLabel Label=null;

    @Override
    public void run() {
        Start--;
        Label.setText(String.valueOf(Start));
    }
    
     
}
