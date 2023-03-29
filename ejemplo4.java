/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).*/

import java.util.Scanner;

public class ejemplo4 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numero");
        Float centigrados = leer.nextFloat();
        Float Fahrenheit = 32 + (9 * centigrados/5);
        System.out.println("Los grados °C son " + centigrados + " " + "Los grados Fahrenheit son " + Fahrenheit);
    }
}
