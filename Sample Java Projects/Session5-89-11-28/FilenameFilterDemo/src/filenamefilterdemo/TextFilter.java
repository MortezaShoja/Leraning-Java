/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package filenamefilterdemo;

import java.io.*;

public class TextFilter implements FilenameFilter {

    public boolean accept(File dir, String name) {
        /*
        if(name.endsWith(".txt"))
        {

            return true;
        }
        else
            return false;*/
        return name.endsWith(".txt");
    }

}
