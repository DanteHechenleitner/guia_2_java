/*Escribir un programa que pida una frase y la muestre toda en mayúsculas 
y después toda en minúsculas.*/

/*Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/

import java.util.Scanner;


public class ejemplo3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        System.out.println(nombre.toUpperCase() + " " + nombre.toLowerCase());
       ;
    }
    
}
