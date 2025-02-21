package Clases;

public class Mago extends Heroe {
    protected int mana;

    public Mago(String nombre, int nivel, int hp, int mana, Arma arma) {
        super(nombre, nivel, hp, arma);
        this.mana = mana;
    }

    public static Mago createMago(String nombre, int nivel, int hp, int mana, Arma arma){
        return new Mago(nombre, nivel, hp, mana, arma);
    }

    @Override
    public String toString() {
        return "Mago:\n   " +
                "Nombre: " + nombre +
                "\n     Nivel: " + nivel +
                "\n     Hp: " + hp +
                "\n     Mana: " + mana +
                "\n     Arma: " + arma.getNombre();
    }
}
