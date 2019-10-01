
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crileiton
 */
public class Implementacion extends UnicastRemoteObject implements Interface{
    
    public Implementacion() throws RemoteException
    {
        super();
    }

    @Override
    public int[] Sumar(int[] pA, int[] pB) throws RemoteException {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        int[] pSum = new int[3];
        for (int i = 0; i < 3; i++)
        {
            pSum[i] = pA[i] + pB[i];
        }
        return pSum;
    }

    @Override
    public int[] Restar(int[] pA, int[] pB) throws RemoteException {
        
        int[] pRes = new int[3];
        for (int i = 0; i < 3; i++)
        {
            pRes[i] = pA[i] - pB[i];
        }
        return pRes;
    }

    @Override
    public int[] Multiplicar(int[] pA, int[] pB) throws RemoteException {
        
        int[] pMul = new int[3];
        for (int i = 0; i < 3; i++)
        {
            pMul[i] = pA[i] * pB[i];
        }
        return pMul;
    }
}
