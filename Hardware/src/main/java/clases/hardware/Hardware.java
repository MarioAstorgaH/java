package clases.hardware;

import javax.swing.JOptionPane;

public class Hardware {
   public static void main(String[] args) {
        String nombre = ingresarNombre();
        String marca = ingresarMarca();
        double precio = ingresarPrecio();
        calcularPrecioFinal(precio, nombre, marca);
    }
    public static String ingresarNombre() {
        return JOptionPane.showInputDialog("Ingresa el nombre del hardware:");
    }
    public static String ingresarMarca() {
        return JOptionPane.showInputDialog("Ingresa la marca del hardware:");
    }
    public static double ingresarPrecio() {
        return Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del hardware:"));
    }
    public static void calcularPrecioFinal(double precio, String nombre, String marca) {
        double precioFinal;
        if (precio > 320) {
            precioFinal = precio + (precio * 0.16);
            System.out.println("El hardware " + nombre + " de la marca " + marca +
                    " tiene un precio superior a 320 soles. El precio final con el 16% de recargo es: " + precioFinal + " soles.");
        } else {
            precioFinal = precio + 10;
            System.out.println("El hardware " + nombre + " de la marca " + marca +
                    " tiene un precio menor o igual a 320 soles. El precio final con 10 soles por movilidad es: " + precioFinal + " soles.");
        }
    }
}
