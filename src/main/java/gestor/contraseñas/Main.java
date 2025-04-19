package gestor.contraseñas;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Crear un usuario con lista vacía de contraseñas
        Usuario usuario = new Usuario("Pepe", "pepito26@email.com", new ArrayList<>());

        boolean activo = true;

        while (activo) {
            System.out.println("\n==== GESTOR DE CONTRASENAS ====");
            System.out.println("1. Agregar contrasena");
            System.out.println("2. Mostrar contrasenas");
            System.out.println("3. Eliminar contrasena");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                        System.out.print("Sitio web: ");
    String sitio = scanner.nextLine();
    System.out.print("Contrasena: ");
    String pass = scanner.nextLine();

    Password nueva = new Password(sitio, pass); // Se encripta automáticamente
    usuario.agregarContraseña(nueva);
    System.out.println("Contrasena agregada.");

    // Salida de la contraseña encriptada
    System.out.println("Contrasena encriptada (Base64): " + nueva.getContraseñaEncriptada());
    break;

                case 2:
                    System.out.println("\nContrasenas guardadas:");
                    usuario.mostrarContraseñas(); // Se desencriptan al mostrar
                    break;

                case 3:
                    System.out.print("Nombre del sitio web a eliminar: ");
                    String sitioEliminar = scanner.nextLine();
                    boolean encontrada = false;

                    for (Password p : new ArrayList<>(usuario.getContraseñas())) {
                        if (p.getSitioWeb().equalsIgnoreCase(sitioEliminar)) {
                            usuario.eliminarContraseña(p);
                            System.out.println("Contrasena eliminada.");
                            encontrada = true;
                            break;
                        }
                    }

                    if (!encontrada) {
                        System.out.println("No se encontro ese sitio web.");
                    }
                    break;

                case 4:
                    activo = false;
                    System.out.println("Saliendo del sistema. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opcion invalida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
}
