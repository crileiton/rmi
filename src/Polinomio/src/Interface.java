
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crileiton
 */
public interface Interface extends Remote{
    
    public int[] Sumar(int[] pA, int[] pB) throws RemoteException;
    public int[] Restar(int[] pA, int[] pB) throws RemoteException;
    public int[] Multiplicar(int[] pA, int[] pB) throws RemoteException;
    
    
}
