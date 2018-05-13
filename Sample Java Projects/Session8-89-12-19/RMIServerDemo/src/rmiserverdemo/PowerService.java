/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rmiserverdemo;

import java.rmi.*;

public interface PowerService extends Remote
{
    public double power(double num,double po) throws RemoteException;
}
