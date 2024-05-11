import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        String nombre;
        int edad;
        double altura , peso ;
        String sexo = "femenino";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        nombre = scanner.nextLine();
        System.out.println("Introduce tu edad:");
        edad = scanner.nextInt();
        System.out.println("Introduce tu altura:");
        altura = scanner.nextDouble();
        System.out.println("Introduce tu peso:");
        peso = scanner.nextDouble();

        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nAltura: "+altura+"\nPeso: "+peso+"\nSexo: "+sexo);
        System.out.println();
        double IMC = calculoIMC(peso,altura);

        System.out.println("Hola "+nombre+" tu IMC teniendo en cuenta tu altura - "+altura+" y tu peso - "+peso+" tiene un valor de: "+IMC);


    }
    public static double calculoIMC(double pesoKG, double alturaM){
        return pesoKG /(alturaM*alturaM);

    }
}
