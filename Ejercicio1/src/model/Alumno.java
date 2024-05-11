package model;

public class Alumno {

    private double nota;

    public Alumno() {
    }

    public Alumno(double nota) {
        this.nota = nota;
    }

    public void mostarDatos(){
        System.out.println("Los datos de los alumnos son: ");
        System.out.println("Nota = " + nota);
    }


    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
