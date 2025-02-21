package Clases;

public class Asesino extends Heroe {
        protected int sigilo;

    public Asesino(String nombre, int nivel, int hp, int sigilo, Arma arma) {
        super(nombre, nivel, hp, arma);
        this.sigilo = sigilo;
    }

    public static Asesino createAsesino(String nombre, int nivel, int hp, int sigilo, Arma arma){
        return new Asesino(nombre, nivel, hp, sigilo, arma);
    }

    @Override
    public String toString() {
        return "Asesino:\n" +
                "   Nombre: " + nombre +
                "\n     Nivel: " + nivel +
                "\n     Hp: " + hp +
                "\n     Sigilo: " + sigilo +
                "\n     Arma: " + arma.getNombre();
    }
}
