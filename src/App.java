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
                case 4:
                    usuarioC.listarUsuarios();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    return;
            }

        }
    }

}
