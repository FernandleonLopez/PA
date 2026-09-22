import java.util.Scanner;

public class SistemaProductos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Producto producto = null;

        int opcion;

        do {

            System.out.println("\n===== SISTEMA DE PRODUCTOS =====");
            System.out.println("1. Registrar producto");
            System.out.println("2. Mostrar producto");
            System.out.println("3. Aumentar stock");
            System.out.println("4. Disminuir stock");
            System.out.println("5. Verificar stock");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:

                    System.out.println("\n--- REGISTRAR PRODUCTO ---");

                    System.out.print("Ingrese código: ");
                    String codigo = teclado.nextLine();

                    System.out.print("Ingrese nombre: ");
                    String nombre = teclado.nextLine();

                    System.out.print("Ingrese precio: ");
                    double precio = teclado.nextDouble();

                    System.out.print("Ingrese stock: ");
                    int stock = teclado.nextInt();

                    producto = new Producto(codigo, nombre, precio, stock);

                    System.out.println("Producto registrado correctamente.");

                    break;

                case 2:

                    System.out.println("\n--- INFORMACIÓN DEL PRODUCTO ---");

                    if (producto != null) {
                        producto.mostrarInformacion();
                    } else {
                        System.out.println("Primero debe registrar un producto.");
                    }

                    break;

                case 3:

                    if (producto != null) {

                        System.out.print("Ingrese cantidad a aumentar: ");
                        int cantidadAumentar = teclado.nextInt();

                        producto.aumentarStock(cantidadAumentar);

                        System.out.println("Stock actualizado correctamente.");

                    } else {
                        System.out.println("Primero debe registrar un producto.");
                    }

                    break;

                case 4:

                    if (producto != null) {

                        System.out.print("Ingrese cantidad a disminuir: ");
                        int cantidadDisminuir = teclado.nextInt();

                        producto.disminuirStock(cantidadDisminuir);

                    } else {
                        System.out.println("Primero debe registrar un producto.");
                    }

                    break;

                case 5:

                    if (producto != null) {

                        producto.verificarStock();

                    } else {
                        System.out.println("Primero debe registrar un producto.");
                    }

                    break;

                case 6:

                    System.out.println("Gracias por utilizar el sistema.");

                    break;

                default:

                    System.out.println("Opción no válida.");

            }

        } while (opcion != 6);

        teclado.close();
    }
}