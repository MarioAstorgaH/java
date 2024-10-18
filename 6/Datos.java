package clases.datos;

import javax.swing.JOptionPane;

public class Datos {

    public static void main(String[] args) {
        datos();
        System.exit(0);
    }
    public static void datos(){
        String name=JOptionPane.showInputDialog("Ingresa tu nombre:");
        String last=JOptionPane.showInputDialog("Ingresa tu apellido:");
        int age=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad:"));
        System.out.println("Datos del usuario:\n"+name+"\n"+last+"\n"+age);
    }
}
