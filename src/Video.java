public class Video {
     String titulo;
     int minutos;
     double precio;

    public Video(String titulo, int minutos, double precio) {
        this.titulo = titulo;
        this.minutos = minutos;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Video{" +
                "Titulo=' " + titulo + '\'' +
                ", Minutos= " + minutos +
                ", Precio= "+ precio + "€" +
                '}';
    }
}

class Pelicula extends Video{
    String director;
    int valoracion;

    public Pelicula(String titulo,int minutos,double precio,String director, int valoracion) {
        super(titulo,minutos,precio);
        this.director = director;
        this.valoracion = valoracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "Director='" + director + '\'' +
                ", Valoracion= " + valoracion +
                ", Titulo='" + titulo + '\'' +
                ", Minutos= " + minutos +
                ", Precio= "+ precio + "€" +
                '}';
    }
}

class VideoMusical extends Video{
     String artista;
     String categoria;

    public VideoMusical(String titulo, int minutos, double precio, String artista, String categoria) {
        super(titulo, minutos,precio);
        this.artista = artista;
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "VideoMusical{" +
                "Artista='" + artista + '\'' +
                ", Categoria='" + categoria + '\'' +
                ", Titulo='" + titulo + '\'' +
                ", Minutos= " + minutos +
                ", Precio= "+ precio + "€" +
                '}';
    }
}
