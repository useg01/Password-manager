package gestor.contraseñas;
import java.util.Base64;
public class Encriptador {
     public static String encriptar(String texto) {
        return Base64.getEncoder().encodeToString(texto.getBytes());
    }

    public static String desencriptar(String textoEncriptado) {
        return new String(Base64.getDecoder().decode(textoEncriptado));
    }
}
