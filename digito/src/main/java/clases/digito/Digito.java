package clases.digito;
import javax.swing.JOptionPane;
public class Digito {
   public static void main(String[] args) {       
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número entero"));   
        mostrarMensaje(num);
    }
    public static void mostrarMensaje(int num) {
        if (num >= 1 && num <= 9) {
            System.out.println("Ha ingresado un número de un dígito");
        } else if (num >= 10 && num <= 99) {
            System.out.println("Ha ingresado un número de dos dígitos");
        } else if (num >= 100 && num <= 999) {
            System.out.println("Ha ingresado un número de tres dígitos");
        } else {
            System.out.println("El número ingresado tiene más de tres dígitos o es menor que 1");
        }
    }
}
