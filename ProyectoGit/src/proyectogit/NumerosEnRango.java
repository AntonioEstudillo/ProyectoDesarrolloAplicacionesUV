/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogit;

/**
 *
 * @author jesus
 */
public class NumerosEnRango {

    /**
     * Imprime todos los números que se encuentran entre dos números (excluyendo los números de entrada en el rango).
     *
     * @param num1 el primer número del rango
     * @param num2 el segundo número del rango
     */
    public static String imprimirNumerosEnRango(int num1, int num2) {
        int inicio = Math.min(num1, num2) + 1;
        int fin = Math.max(num1, num2) - 1;
        
        String salida = "";
        
        for (int i = inicio; i <= fin; i++) {
            if(i%2!=0){
                salida += i +" ";
            }
        }

        return salida;
    }
}