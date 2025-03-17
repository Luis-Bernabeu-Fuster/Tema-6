import java.util.HashMap;
import java.util.Map;

public class Paradas {
    String nombre;
    String direccion;
    int tiempo;
    Map<String, String> mapaParadas = new HashMap<>();

    public Paradas(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }


    public void addParada(String nombre, String direccion){
        mapaParadas.put(nombre,direccion);
    }

    @Override
    public String toString() {
        return nombre + " " + direccion ;
    }
}