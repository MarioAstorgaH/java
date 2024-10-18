package clases.mayoria;

import javax.swing.JOptionPane;

public class Mayoria {

    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("Ingresa tu nombre:");
        String last=JOptionPane.showInputDialog("Ingresa tu apellido:");
        int age=Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu edad:"));
        System.out.println("Datos del usuario:\n"+name+"\n"+last);
        if(datos(age)==1){
            System.out.println("Mayor de edad");
        }
        else{
            System.out.println("Menor de edad");
        }
    }
       public static int datos(int age){
        if(age>=18){
            return 1;
        }
        else{
            return 0;
        }
    }
}
