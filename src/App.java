import java.util.Scanner;

import controller.UsuarioController;
import model.Usuario;

public class App {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        UsuarioController usuarioC = new UsuarioController();
        while (true) {
            System.out.println("=== MENÚ PRINCIPAL ===");
            System.out.println("1. Crear usuario");
            System.out.println("2. Actualizar usuario");
            System.out.println("3. Eliminar usuario");
            System.out.println("4. Listar usuarios");
            System.out.println("5. Buscar usuario por ID");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Digite el documento");
                    String documento = teclado.nextLine();
                    System.out.println("Digite los nombres");
                    String nombres = teclado.nextLine();
                    System.out.println("Digite los apellidos");
                    String apellidos = teclado.nextLine();
                    System.out.println("Digite el correo");
                    String correo = teclado.nextLine();
                    Usuario usuario = new Usuario(documento, nombres, apellidos, correo);
                    usuarioC.agregarUsuario(usuario);
                    break;
                case 2:
                    System.out.println("Digite el ID del usuario que desea actualizar:");
                    int idActualizar = teclado.nextInt();
                    teclado.nextLine(); // limpiar el buffer
                    System.out.println("Digite los nuevos nombres:");
                    String nuevosNombres = teclado.nextLine();
                    System.out.println("Digite los nuevos apellidos:");
                    String nuevosApellidos = teclado.nextLine();
                    System.out.println("Digite el nuevo correo:");
                    String nuevoCorreo = teclado.nextLine();
                    Usuario usuarioActualizar = new Usuario();
                    usuarioActualizar.setId(idActualizar);
                    usuarioActualizar.setNombres(nuevosNombres);
                    usuarioActualizar.setApellidos(nuevosApellidos);
                    usuarioActualizar.setCorreo(nuevoCorreo);
                    usuarioC.actualizarUsuario(usuarioActualizar);
                    break;
                case 3:
                    System.out.println("Digite el ID del usuario que desea eliminar:");
                    int idEliminar = teclado.nextInt();
                    usuarioC.eliminarUsuario(idEliminar);
                    break;
                case 4:
                    usuarioC.listarUsuarios();
                    break;
                case 5:
                    System.out.println("Digite el ID del usuario que desea buscar:");
                    int idBuscar = teclado.nextInt();
                    usuarioC.obtenerUsuarioPorId(idBuscar);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }
    }
}
