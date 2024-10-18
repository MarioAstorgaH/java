package clases.escaleras;

import javax.swing.JOptionPane;

public class Escaleras {

    public static void main(String[] args) {
        int escalon=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el escalon al que deseas subir:"));
        subir(escalon);
        System.exit(0);
    }
    public static void subir(int escalon){
        for(int i=1;i<=escalon;i++){
            System.out.println(i);
        }
    }
}
