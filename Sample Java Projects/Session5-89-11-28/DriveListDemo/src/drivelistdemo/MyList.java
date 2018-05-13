/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package drivelistdemo;

import java.io.*;
import javax.swing.*;

public class MyList extends JList {

    String[] _Drives=null;
    
    public MyList() {
        _Drives=new String[File.listRoots().length];
        int index=0;
        for(File Drive:File.listRoots())
        {
            _Drives[index++]=Drive.getAbsolutePath();
        }
        ListModel m=new AbstractListModel() {

            public int getSize() {
                return _Drives.length;
            }

            public Object getElementAt(int i) {
                return _Drives[i];
            }
        };
        this.setModel(m);
    }
    

}
