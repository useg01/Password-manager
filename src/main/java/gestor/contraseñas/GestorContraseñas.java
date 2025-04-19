package gestor.contraseñas;
import java.util.ArrayList;
import java.util.List;
public class GestorContraseñas {
    private List<Usuario> usuarios;

    public GestorContraseñas() {
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarUsuarioPorEmail(String email) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equalsIgnoreCase(email)) {
                return u;
            }
        }
        return null;
    }
}
