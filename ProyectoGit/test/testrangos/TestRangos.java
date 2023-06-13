/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testrangos;


import org.junit.Test;
import static org.junit.Assert.*;
import proyectogit.NumerosEnRango;

public class TestRangos {
     
    @Test
    public void imprimirNumerosEnRango() {
        
        int num1 = 5;
        int num2 = 10;
        String expectedOutput = "6 8 ";
        
        
        String actualOutput = NumerosEnRango.imprimirNumerosEnRango(num1, num2);
        
        assertEquals(expectedOutput, actualOutput);
    }
}
