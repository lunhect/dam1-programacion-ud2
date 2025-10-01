package utilidades;

 import java.util.Scanner;

public class DatosUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        


        System.out.print("Introduce tu correo electrónico: ");
        String email = sc.nextLine();

        
        boolean emailValido = ProcesadorTexto.esEmailValido(email);

        if (emailValido) {
           
            Usuario usuario = new Usuario(nombre, edad, email);
            usuario.mostrarInformacion();
        } else {
            System.out.println("El usuario no puede ser creado porque el email introducido no es válido.");
        }

        sc.close();
    }
}