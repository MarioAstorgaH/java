package clases.genero;

import javax.swing.JOptionPane;

public class Genero {

    public static void main(String[] args) {
        String name=JOptionPane.showInputDialog("Ingresa tu nombre:");
        String gen=JOptionPane.showInputDialog("Ingresa tu genero: (F, M)");
        genero(gen,name);
        System.exit(0);
    }
    public static void genero(String gen,String name){
        if(gen=="M"){
            JOptionPane.showMessageDialog(null, name+" es un nombre de Hombre");
        }
        else{
            JOptionPane.showMessageDialog(null, name+" es un nombre de Mujer");
        }
    }
}
