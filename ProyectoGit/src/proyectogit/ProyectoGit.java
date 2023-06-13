/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogit;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class ProyectoGit {

 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NumerosEnRango imprimirNumeros = new NumerosEnRango();
        
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Los números en el rango son:");
        System.out.println(imprimirNumeros.imprimirNumerosEnRango(num1, num2));

        scanner.close();
    }
}
