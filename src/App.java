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
            System.out.println("5. Buscar usuario por documento");
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
                    System.out.println("Digite el id del usuario a actulizar");
                    int id = teclado.nextInt();
                    teclado.nextLine();
                    usuario = usuarioC.obtenerUsuarioPorId(id);
                    System.out.println(usuario);
                    System.out.println("Digite los nombres");
                    nombres = teclado.nextLine();

                    if (nombres!="") {
                        usuario.setNombres(nombres);
                    }
                    
                    System.out.println("Digite los apellidos");
                    apellidos = teclado.nextLine();
                    if (apellidos!="") {
                        usuario.setNombres(apellidos);
                    }
                    System.out.println("Digite el correo");
                    correo = teclado.nextLine();
                    if (correo!="") {
                        usuario.setNombres(correo);
                    }
                    usuarioC.actualizarUsuario(usuario);
                    break;
                case 3:
                    System.out.println("Digite el id del usuario a eliminar");
                    id = teclado.nextInt();
                    teclado.nextLine();
                    usuarioC.eliminarUsuario(id);
                    break;
                case 4:
                    usuarioC.listarUsuarios();
                    break;
                case 5:
                    System.out.println("Digite el id del usuario a buscar");
                    id = teclado.nextInt();
                    teclado.nextLine();
                    usuario= usuarioC.obtenerUsuarioPorId(id);
                    System.out.println(usuario);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    return;
            }

        }
    }

}
