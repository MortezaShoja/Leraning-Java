/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package newrmiserverdemo;

import java.io.Serializable;

/**
 *
 * @author Ramezani
 */
public class Message implements Serializable{
    public String Sender="";
    public String Body="";

    public Message(String argSender,String argBody) {
        Sender=argSender;
        Body=argBody;
    }


}
