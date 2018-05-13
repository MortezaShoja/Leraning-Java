/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package arraydemo;

/**
 *
 * @author Ramezani
 */
import javax.swing.JOptionPane;
import java.util.Arrays;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[]Members=null;
        while(true)
        {
            String NewMember=JOptionPane.showInputDialog("New : ");
            if(!(Exists(Members, NewMember)))
            {
                Members=Add(Members, NewMember);
                PrintArray(Members);
            }
            else
                JOptionPane.showMessageDialog(null, "Member Exists !");
        }
    }

    static Boolean Exists(String[]argArray,String argMember)
    {
        if(argArray==null)
            return false;
        Boolean Result=false;
        for(String sp:argArray)
        {
            if(sp.equals(argMember))
            {
                Result=true;
                break;
            }
        }
        return Result;
    }

    static String[]Add(String[]argArray,String argMember)
    {
        if(argArray==null)
        {
            argArray=new String[1];
            argArray[0]=argMember;
        }
        else
        {
            String[]tmp=new String[argArray.length+1];
            for(int i=0;i<argArray.length;i++)
            {
                tmp[i]=argArray[i];
            }
            tmp[tmp.length-1]=argMember;
            argArray=tmp;
        }
        return argArray;
    }

    static void PrintArray(String[]argArray)
    {
        for(String sp:argArray)
        {
            System.out.println(sp);
        }
        System.out.println("---------");
    }

}
