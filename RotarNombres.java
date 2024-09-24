import java.util.Scanner;

public class RotarNombres {

    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese 1er nombre");
        String nombre1 = teclado.nextLine();
        System.out.println("Ingrese 2do nombre");
        String nombre2 = teclado.nextLine();
        System.out.println("El nombre rotado es: " +  nombre2  + " " + nombre1);

    }
}
