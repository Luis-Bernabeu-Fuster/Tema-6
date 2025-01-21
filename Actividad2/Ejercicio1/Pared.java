public class Pared {
    private String direccion;

    public Pared(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Pared{" +
                "direccion='" + direccion + '\'' +
                '}';
    }
}
