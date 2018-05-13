/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package directoriesonlydemo;

import java.io.*;

public class FileFilter implements FilenameFilter {

    public boolean accept(File dir, String name) {
        File f=new File(String.format("%s\\%s", dir,name));
       //System.out.println(String.format("%s%s", dir,name));
        //System.out.println(f.getAbsoluteFile());
        return f.isFile();
    }

}
