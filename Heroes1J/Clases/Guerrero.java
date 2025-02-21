package Clases;

public class Guerrero extends Heroe {
    protected int atck;

    public Guerrero(String nombre, int nivel, int hp, int atck, Arma arma) {
        super(nombre, nivel, hp, arma);
        this.atck = atck;
    }

    public static Guerrero createGuerrero(String nombre, int nivel, int hp, int atck, Arma arma){
        return new Guerrero(nombre, nivel, hp, atck,arma);
    }

    @Override
    public String toString() {
        return "Guerrero:\n" +
                "   Nombre: " + nombre +
                "\n     Nivel: " + nivel +
                "\n     Hp: " + hp +
                "\n     Puntos de fuerza: " + atck +
                "\n     Arma: " + arma.getNombre();
    }

}
