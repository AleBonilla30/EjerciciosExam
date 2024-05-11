import model.Alumno;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        double suma = 0.0;
        int suspensos = 0;
        int aprobados = 0;
        boolean maximo = false;
        boolean minimo = true;
        double max = 0;
        double min = 0;


        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.print("Introduce la nota de los alumnos "+(i+1)+":");
             double nota = scanner.nextDouble();
            listaAlumnos.add(new Alumno(nota));
            suma += nota;
            if (!maximo){
                max = nota;
                maximo = true;
            }else {
                if (nota > max){
                    max = nota;
                }
            }
            if (minimo){
                min = nota;
                minimo = false;
            }else {
                if (nota < min){
                    min = nota;
                }
            }


            if (nota<5){
                 suspensos++;
             }
             if (nota>=5){
                 aprobados++;
             }
        }

        double media = suma/20;
        System.out.println("La nota maxima es: "+max);
        System.out.println("La nota minima es: "+min);
        System.out.println("La cantidad de aprovados: "+aprobados);
        System.out.println("La cantidad de suspensos: "+suspensos);
        System.out.println("La nota media: "+media);



    }

}
