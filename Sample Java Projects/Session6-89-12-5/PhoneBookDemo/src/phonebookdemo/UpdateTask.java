/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package phonebookdemo;

import java.awt.HeadlessException;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class UpdateTask extends TimerTask {

    public JTable SourceTable;
    long Modified=0;

    public UpdateTask() {
    }
    
    
    
    @Override
    public void run() {
        final ArrayList Data=new ArrayList();
        File f=new File("\\\\192.168.255.164\\AppData\\Data.txt");
        if(Modified==0)
            Modified=f.lastModified();
        else if(Modified!=f.lastModified())
        {
            try
            {
                BufferedReader r=new BufferedReader(new FileReader(f));
                
                while(r.ready())
                {
                    String[]Row=r.readLine().split(",");
                    Data.add(Row);
                }
                r.close();
            }
            catch(FileNotFoundException ex1)
            {
                JOptionPane.showMessageDialog(null, ex1.getMessage());
            }
            catch(HeadlessException ex2)
            {
                JOptionPane.showMessageDialog(null, ex2.getMessage());
            }
            catch(IOException ex3)
            {
                JOptionPane.showMessageDialog(null, ex3.getMessage());
            }
            TableModel m=new AbstractTableModel() {

                public int getRowCount() {
                    return Data.size();
                }

                public int getColumnCount() {
                    return 3;
                }

                public Object getValueAt(int rowIndex, int columnIndex) {
                    return ((String[])Data.get(rowIndex))[columnIndex];
                }
            };
            SourceTable.setModel(m);
            Modified=f.lastModified();
        }
    }
}
