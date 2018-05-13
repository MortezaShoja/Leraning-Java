/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package createdemo;

/**
 *
 * @author Ramezani
 */
public class Reverse {

    String Input="";

    static Reverse Create(String s)
    {
        if(s.length()%2!=0)
            return null;
        else
            return new Reverse();
    }

}
