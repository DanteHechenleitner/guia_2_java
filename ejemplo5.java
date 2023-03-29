/*Escribir un programa que lea un número entero por teclado y muestre 
por pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt()*/

import java.util.Scanner;

public class ejemplo5 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numero");
        int num1 = leer.nextInt();
        System.out.println("El doble es: " + (num1*2) + " El triple es: " + (num1*3) + " La raiz cuadrada es: " + Math.sqrt(num1));
    }
}
