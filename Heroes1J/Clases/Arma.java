package Clases;

public class Arma {
    protected String nombre;
    protected int danio;

    public String getNombre() {
        return nombre;
    }

    public int getDanio() {
        return danio;
    }

    public Arma(String nombre, int danio) {
        this.nombre = nombre;
        this.danio = danio;
    }

    public static Arma createArma(String nombre, int danio){
        return new Arma(nombre,danio);
    }

    @Override
    public String toString() {
        return  nombre + ", Daño: " + danio;
    }
}
