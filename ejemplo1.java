/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma*/

/// ejer 1

import java.util.Scanner;

public class ejemplo1 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese dos numero");
    int num1 = leer.nextInt();
    int num2 = leer.nextInt();
    System.out.println("Las suma de los numeros es: " + (num1 + num2));
}
}
