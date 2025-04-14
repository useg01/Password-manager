package gestor.contraseñas;
public class Password {
     private String sitioWeb;
    private String contraseña;

    // Constructor
    public Password(String sitioWeb, String contraseña) {
        this.sitioWeb = sitioWeb;
        this.contraseña = contraseña;
    }

    // Métodos Getter y Setter
    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    // Método para mostrar la información de la contraseña
    @Override
    public String toString() {
        return "Sitio Web: " + sitioWeb + "\nContraseña: " + contraseña;
    }
}
