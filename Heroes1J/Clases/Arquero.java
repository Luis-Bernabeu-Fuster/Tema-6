package Clases;

public class Arquero extends Heroe {
    protected int precison;

    public Arquero(String nombre, int nivel, int hp, int precison, Arma arma) {
        super(nombre, nivel, hp, arma);
        this.precison = precison;
    }

    public static Arquero createHeroe(String nombre, int nivel, int hp, int precison, Arma arma){
        return new Arquero(nombre,nivel,hp,precison,arma);
    }

    @Override
    public String toString() {
        return "Arquero:\n" +
                "   Nombre: " + nombre +
                "\n     Nivel: " + nivel +
                "\n     Hp: " + hp +
                "\n     Precisón: " + precison +
                "\n     Arma: " + arma.getNombre() ;
    }
}
