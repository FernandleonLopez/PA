public class Producto {

    String codigo;
    String nombre;
    double precio;
    int stock;

    // Constructor
    public Producto(String codigo, String nombre, double precio, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método para mostrar la información del producto
    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: S/ " + precio);
        System.out.println("Stock: " + stock);
    }

    // Método para aumentar el stock
    public void aumentarStock(int cantidad) {
        stock = stock + cantidad;
    }

    // Método para disminuir el stock
    public void disminuirStock(int cantidad) {
        if (cantidad <= stock) {
            stock = stock - cantidad;
        } else {
            System.out.println("No hay suficiente stock.");
        }
    }

    // Método para verificar el stock
    public void verificarStock() {
        if (stock > 0) {
            System.out.println("El producto tiene stock disponible.");
        } else {
            System.out.println("El producto está agotado.");
        }
    }
}