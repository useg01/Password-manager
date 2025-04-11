package gestor.contraseñas;

import java.util.List;

public class Usuario {

  
  //Atributos
    String nombre;
    String email;
    List<Password> contraseñas; 
    //Constructores
    public Usuario(String nombre, String email, List<Password> contraseñas) {
        this.nombre = nombre;
        this.email = email;
        this.contraseñas = contraseñas;
    }
    //Metodo para agregar contraseña a la lista
    public void agregarContraseña(Password contraseña) {
        contraseñas.add(contraseña);
    }
    // Metodo para eliminar contraseña de la lista
    public void eliminarContraseña(Password contraseña) {
        contraseñas.remove(contraseña);
    }
    // Metodo para mostrar la contraseña
    public void mostrarContraseñas() {
        for (Password contraseña : contraseñas) {
            System.out.println(contraseña);
        }
    }
    // Getter y Setter para cada campo
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<Password> getContraseñas() {
        return contraseñas;
    }
    public void setContraseñas(List<Password> contraseñas) {
        this.contraseñas = contraseñas;
    }
}


