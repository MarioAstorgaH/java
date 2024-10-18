package clases.garrafon;
public class Garrafon {
private int capacidadMaxima;
private int capacidadActual;

    public Garrafon(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }
    public void llenarGarrafon(){
        capacidadActual=capacidadMaxima;
    }
    public int servirVaso(int agua){
        int estado=0;
        if(agua<1){
            estado=1;
        }
        return estado;
    }
    public void vaciarAgua(){
        capacidadActual=0;
    }
    public int agregarAgua(int agua){
        return capacidadActual+=agua;
    }
}
