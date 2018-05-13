/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mycontrolsdemo;

import javax.swing.*;
import java.io.*;

public class MyDriveList extends JList {

    String[]_Drives=null;

    public MyDriveList() {
        _Drives=new String[File.listRoots().length];
        int DriveIndex=0;
        for(File Drive:File.listRoots())
        {
            _Drives[DriveIndex++]=Drive.getAbsolutePath();
        }
        ListModel m=new AbstractListModel() {

            public int getSize() {
                return _Drives.length;
            }

            public Object getElementAt(int index) {
                return _Drives[index];
            }
        };
        this.setModel(m);
    }


}
