package gestor.contraseñas;
public class Password {
    private String sitioWeb;
    private String contraseñaEncriptada;

    // Constructor
    public Password(String sitioWeb, String contraseña) {
        this.sitioWeb = sitioWeb;
        this.contraseñaEncriptada = Encriptador.encriptar(contraseña); // Encriptar al guardar
    }

    // Métodos Getter y Setter
    public String getSitioWeb() {
        return sitioWeb;
    }
public String getContraseñaEncriptada() {
    return contraseñaEncriptada;
}
    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getContraseña() {
        return Encriptador.desencriptar(contraseñaEncriptada); // Desencriptar al leer
    }

    public void setContraseña(String contraseña) {
        this.contraseñaEncriptada = Encriptador.encriptar(contraseña);
    }

    // Mostrar la información
    @Override
    public String toString() {
        return "Sitio Web: " + sitioWeb + "\nContrasena: " + getContraseña(); // Mostrar desencriptada
    }
}
