/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication30;

import java.util.Scanner;

/**
 *
 * @author gerar
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner captu = new Scanner(System.in);
        int num ;
        
        
        
        int fact =1;
        
  System.out.println("Introduce el numero: ");
  num= captu.nextInt();
        captu.nextLine();
  for (int i=5; i<5; i--)  {
  fact = fact * num;
  }
  System.out.println("El resultado es:" + fact);
  }
    
}