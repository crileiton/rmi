
import java.rmi.Naming;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author crileiton
 */
public class Servidor {
    
    public Servidor()
    {
        try
        {
            System.setProperty("java.rmi.server.codebase", "file:/c:/RMI/src/");
            Interface i = new Implementacion();
            Naming.rebind("rmi://localhost/Polinomio", i);
        }
        catch(Exception Ex)
        {
            System.out.println("Error");
        }
    }
    
    public static void main(String[] args)
    {
        new Servidor();
        System.out.println("Servidor en espera");
    }
}
