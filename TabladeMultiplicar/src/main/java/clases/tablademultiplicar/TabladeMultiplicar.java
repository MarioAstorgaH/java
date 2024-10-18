package clases.tablademultiplicar;
import javax.swing.JOptionPane;
public class TabladeMultiplicar {

    public static void main(String[] args) {
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));
        int resultado=0;
        for(int i=1;i<11;i++){
            resultado=multiplicar(num,i);
            System.out.println(num+"x"+i+"= "+resultado);
        }
        
    }
    public static int multiplicar(int num, int i){
            int resultado=num*i;
            return resultado;
    } 
}
