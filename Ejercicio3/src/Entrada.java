import model.Sistema;
import model.Usuario;

public class Entrada {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        Usuario usuario1 = new Usuario("Alejandra","ale@gmail.com","12345t");
        Usuario usuario2 = new Usuario("Jorge","jorge@gmail.com","5678o");
        Usuario usuario3 = new Usuario("Damaris","dam@gmail.com","8976p");
        sistema.darAltaUsuario(usuario1);
        sistema.darAltaUsuario(usuario2);
        sistema.darAltaUsuario(usuario3);
        sistema.listarUsuario();
        sistema.login("ale@gmail.com","12345t");
        sistema.login("dam@gmail.com","8976p");
        sistema.login("dani@gmail.com","129r");
    }
}
