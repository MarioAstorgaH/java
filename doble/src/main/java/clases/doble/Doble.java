package clases.doble;

import javax.swing.JOptionPane;

public class Doble {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
        for (int i = 1; i <= num * 2; i++) {
            int resultado = doble(i); 
            if (resultado != -1) { 
                System.out.println(resultado);
            }
        }
    }
    public static int doble(int num) {
        if (num % 2 == 0) {
            return num; 
        } else {
            return -1; 
        }
    }
}
