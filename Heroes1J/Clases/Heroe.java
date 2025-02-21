package Clases;

public class Heroe { //Luis Bernabeu Fuster
    protected String nombre;
    protected int nivel;
    protected int hp;
    protected Arma arma;

    public Heroe(String nombre, int nivel, int hp, Arma arma) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.hp = hp;
        this.arma = arma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Héroe{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", hp=" + hp +
                "Arma: " + arma.getNombre();
    }
}
