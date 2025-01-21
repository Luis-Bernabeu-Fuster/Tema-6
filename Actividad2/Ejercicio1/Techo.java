public class Techo {
    private int altura;
    private String color;

    public Techo(int altura, String color) {
        this.altura = altura;
        this.color = color;
    }

    public int getAltura() {
        return altura;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Techo{" +
                "altura=" + altura +
                ", color='" + color + '\'' +
                '}';
    }
}
