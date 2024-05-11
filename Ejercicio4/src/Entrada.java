import javax.swing.*;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        int numAleatorio = (int) (Math.random()*5000);
        JOptionPane.showMessageDialog(null,numAleatorio);
        int intentos = 4;

        Scanner scanner = new Scanner(System.in);
        do {
            for (int i = 0; i < 5; i++) {
                System.out.print("Introduce numeros para poder abrir la caja fuerte "+(i+1)+": ");
                int numero = scanner.nextInt();
                if (numero == numAleatorio){
                    System.out.println("Felicidades has abierto la caja");
                    break;
                } else {
                    System.out.println("Error, te quedan "+intentos+" intentos.");
                    intentos--;

                }
            }

        }while (intentos == 0 );
        if (intentos<=0){
            System.out.println("Caja bloqueada has perdido tu oportunidad");
        }










    }
}
