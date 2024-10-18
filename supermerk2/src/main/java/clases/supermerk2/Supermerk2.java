package clases.supermerk2;
import javax.swing.JOptionPane;
import java.util.Arrays;
public class Supermerk2 {

    public static void main(String[] args) {
        double[] precio=new double[10];
        String[] producto=new String[10];
        int i;
        double total=0;
        String name=JOptionPane.showInputDialog("Ingresa tu nombre:");
        int tp=Integer.parseInt(JOptionPane.showInputDialog("Cuantos productos vas a comprar? (Maximo 10)"));
        for(i=0;i<tp;i++){
            producto[i]=JOptionPane.showInputDialog("Ingrese el producto que desea comprar:");
            precio[i]=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio del producto:"));
            total+=precio[i];
        }
        double Fprice=descuento(total);
        JOptionPane.showMessageDialog(null, name+"\n"+Arrays.toString(producto)+"\n"+Arrays.toString(precio)+"\n"+Fprice);
    }
    public static double descuento(double total){
        double discount;
        if(total>1000){
            discount=total*.2;
            total-=discount;
            return total;
        }
        else{
            return total;
        }
    }
}
