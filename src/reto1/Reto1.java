/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    private static final Scanner scanner = new Scanner(System.in);
    
    public static String read(){
        return scanner.nextLine();
    }
    
    public static void main(String[] args) {
        String input = read();
        String[] arr = input.split(" ");
        double peso = Double.parseDouble(arr[0]);
        double altura = Double.parseDouble(arr[1]);
        int edad = Integer.parseInt(arr[2]);
        if (peso>0 && peso<150 && altura>0.1 && altura<2.5 && edad>0 && edad<110){
            double imc = peso/Math.pow(altura,2);
            if (imc<22 && edad<45){
                System.out.println(String.format("%.1f",imc) + " Bajo");
            }
            if ((imc<22 && edad>=45)||(imc>=22 && edad<45)){
                System.out.println(String.format("%.1f",imc) + " Medio");
            }
            if (imc>=22 && edad>=45){
                System.out.println(String.format("%.1f",imc) + " Alto");
            }
        }else{
            System.out.println("ERROR");
        }
    }
    
}
