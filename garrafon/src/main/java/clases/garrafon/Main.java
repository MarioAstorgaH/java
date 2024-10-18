package clases.garrafon;
import javax.swing.JOptionPane;
public class Main {
    public static void main(String args []){
        int capacidadActual=0,capacidadMaxima=1000;
        int opc=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la opción de constructor: \n1-Capacidad Actual=0\n2-Capacidad Actual=Maxima\n3-Asignar capacidad"));
        switch (opc){
            case 1:
                capacidadActual=0;
                break;
            case 2:
                capacidadActual=capacidadMaxima;
                break;
            case 3: 
                capacidadActual=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de agua que tiene el garrafon"));
                break;            
        }
        Garrafon garrafon = new Garrafon(capacidadMaxima,capacidadActual);
        int agua=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de agua que servira:"));
        if(garrafon.servirVaso(agua)!=0){
            JOptionPane.showMessageDialog(null, "El vaso no se lleno");
        }
        else{
            JOptionPane.showMessageDialog(null, "El vaso esta lleno");
        }
        garrafon.llenarGarrafon();
        garrafon.vaciarAgua();
        agua=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de agua que agregara:"));
        garrafon.agregarAgua(agua);
    }
}
