import java.util.Scanner;

public class HallarEdad {

    public static void main(String[] args) {
        //Hallar la edad de una persona, conociendo su a�o de nacimiento; declarar una CONSTANTE
        //con el a�o actual.
        //ENTRADA: a�o de nacimiento
        //PROCESO: Hallar edad
        //SALIDA: Edad persona
        final int anioActual = 2024;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el anio de nacimiento: ");
        int anioNacimiento = teclado.nextInt();
        System.out.println("Su edad es: " + (anioActual-anioNacimiento));

    }
}
