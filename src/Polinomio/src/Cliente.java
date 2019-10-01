
import java.io.InputStreamReader;
import java.rmi.Naming;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author crileiton
 */
public class Cliente {

    public static void MostrarMenu() {
        System.out.println("****************");
        System.out.println("******Menú******");
        System.out.println("****************");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Salir");
        LeerSeleccion();

    }

    public static void LeerSeleccion() {
        try {
            int Seleccion;
            int[] polinomioA;
            int[] polinomioB;
            int[] resultado;
            Interface i = (Interface) Naming.lookup("rmi://localhost/Polinomio");
            System.out.println("Digite su opción: ");
            Scanner sc = new Scanner(new InputStreamReader(System.in));
            Seleccion = sc.nextInt();
            switch (Seleccion) {
                case 1:
                    System.out.print("Sumar: ");
                    polinomioA = LeerPolinomio("Ingrese el primer polinomio");
                    polinomioB = LeerPolinomio("Ingrese el segundo polinomio");
                    resultado = i.Sumar(polinomioA, polinomioB);
                    System.out.println("El resultado es: ");
                    MostrarPolinomio(resultado);
                    MostrarMenu();
                    break;

                case 2:
                    System.out.print("Restar: ");
                    polinomioA = LeerPolinomio("Ingrese el primer polinomio");
                    polinomioB = LeerPolinomio("Ingrese el segundo polinomio");
                    resultado = i.Restar(polinomioA, polinomioB);
                    System.out.println("El resultado es: ");
                    MostrarPolinomio(resultado);
                    MostrarMenu();
                    break;

                case 3:
                    System.out.print("Multiplicar: ");
                    polinomioA = LeerPolinomio("Ingrese el primer polinomio");
                    polinomioB = LeerPolinomio("Ingrese el segundo polinomio");
                    resultado = i.Multiplicar(polinomioA, polinomioB);
                    System.out.println("El resultado es: ");
                    MostrarPolinomio(resultado);
                    MostrarMenu();
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.print("Opción Incorrecta");
                    MostrarMenu();
                    break;
            }
        } catch (Exception Ex) {

        }
    }
    
    public static int[] LeerPolinomio(String pMensaje)
    {
        int[] Polinomio = new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println(pMensaje);
        for(int i = 0; i < 3; i++)
        {
            Polinomio[i] = sc.nextInt();
        }
        return Polinomio;
    }
    
    public static void MostrarPolinomio(int[] pPolinomio)
    {
        for(int i = 0; i < 3; i++)
        {
            System.out.println(" " + pPolinomio[i]);
        }
    }
    
    public static void main(String[] args)
    {
        try
        {
            MostrarMenu();
        }
        catch(Exception Ex)
        {
            
        }
    }
}
