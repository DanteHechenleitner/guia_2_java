/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.*/
////ejer 2
import java.util.Scanner;


public class ejemplo2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre = leer.nextLine();
        System.out.println("Su numbre es " + nombre);
        //System.out.println("Las suma de los numeros es: " + (num1 + num2));
    }
}
