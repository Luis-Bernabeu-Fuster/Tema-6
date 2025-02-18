import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    protected String nombre;
    protected String artista;
    protected ArrayList<Cancion> canciones = new ArrayList<>();

    public Album(String nombre, String artista) {
        this.nombre = nombre;
        this.artista = artista;
    }

    private Cancion findSong(String titulo){
        for (int i = 0; i < canciones.size(); i++){
            if (canciones.get(i).getTitulo().equalsIgnoreCase(titulo)){
                return canciones.get(i);
            }
        }
        return null;
    }

    public boolean addSong(String titulo,double duracion){
        if (findSong(titulo) == null){
            Cancion cancion = new Cancion(titulo,duracion);
            this.canciones.add(cancion);
            return true;
        } else {
            return false;
        }
    }

    public boolean addToPlayList(int numPist, LinkedList<Cancion> listaReproduc){
        for (int i = 0; i < this.canciones.size(); i++){
            if (i == numPist - 1){
                listaReproduc.add(findSong(canciones.get(i).getTitulo()));
                return true;
            }
        }
        return false;
    }

    public boolean addToPlayList(String titulo, LinkedList<Cancion> listaReproduc){
        boolean devuelve = false;
            for (int i = 0; i < this.canciones.size(); i++){
                if (this.canciones.get(i).getTitulo().equalsIgnoreCase(titulo)){
                    listaReproduc.add(findSong(this.canciones.get(i).getTitulo()));
                    devuelve = true;
                }
            }
            return devuelve;
    }
}
