package model;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Usuario> listaUsuarios;

    public Sistema() {
        listaUsuarios = new ArrayList<>();
    }

    public void darAltaUsuario(Usuario usuario){
            listaUsuarios.add(usuario);
    }
    public void listarUsuario(){
        for (Usuario usuario:listaUsuarios) {
            usuario.mostrarDatos();
            System.out.println();
        }
    }
    public boolean login(String correo, String contrasena){

        for (Usuario usuario:listaUsuarios) {
            if ((usuario.getCorreo().equals(correo) && usuario.getContrasena().equals(contrasena))){
                System.out.println("El usuario esta dado de alta en el sistema");
                return true;
            }
        }

        System.out.println("Usuario no esta dado de alta en el sistema");
        return false;

    }



}
