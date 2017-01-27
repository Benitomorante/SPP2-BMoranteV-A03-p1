/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.bmorantev.a03;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class SPP2BMoranteVA03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Calcular la hipotenusa
      double CA, CO; // cateto adyacente y cateto opuesto
      double H; // hipotenusa
      CA= pedirCA();
      CO= pedirCO();
      H= calcularH(CA, CO);
      mostrarH(H);
      
      
    }
    //Cateto adyacente
    public static double pedirCA (){
     double CA;
        System.out.println("Valor del cateto adyacente");
        Scanner entradaCA = new Scanner(System.in);
        CA = entradaCA.nextDouble();
        return CA;
    }
    //Cateto opuesto
    public static double pedirCO(){
     double CO;
        System.out.println("Valor del cateto opuesto");
        Scanner entradaCO = new Scanner (System.in);
        CO = entradaCO.nextDouble();
        return CO;
    }
    //Calcular hipotenusa
    public static double calcularH (double CA, double CO){
    double H;
    H = Math.sqrt(Math.pow(CA, 2)+ Math.pow(CO, 2));
    return H;
    
    }
    public static void mostrarH (double H){
        System.out.println("El valor del hipotenusa es =" + H);
        System.out.println("Métodos de Math utilizados =");
        System.out.println("1. Elevación al cuadrado");
        System.out.println("2. Calculo de raiz cuadrada");
    }
   
}
