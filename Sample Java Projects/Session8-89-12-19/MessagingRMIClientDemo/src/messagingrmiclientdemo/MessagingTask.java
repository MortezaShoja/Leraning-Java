/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package messagingrmiclientdemo;

import java.rmi.RemoteException;
import java.util.*;
import javax.swing.AbstractListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import messagingrmiserverdemo.MessagingService;

public class MessagingTask extends TimerTask {

    public JList SourceList=null;
    public MessagingService srv=null;
    String[]_Data=null;

    @Override
    public void run() {
        try
        {
            _Data=srv.receive();
        }
        catch(RemoteException ex1)
        {
            JOptionPane.showMessageDialog(null, ex1.getMessage());
        }
        ListModel m=new AbstractListModel() {

            public int getSize() {
                return _Data.length;
            }

            public Object getElementAt(int index) {
                return _Data[index];
            }
        };
        SourceList.setModel(m);
    }

}
