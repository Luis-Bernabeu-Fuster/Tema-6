public class Main {
    /*
    4º
            Clase padre: Ropa
            Clase hija 1: Cmiseta
            Clase hija 2: Pantalon
     */
    public static void main(String[] args) {
        Video peli1 = new Video("VHS",90,15.50);
        Pelicula peli2 = new Pelicula("ET",120,19.99,"Spielberg",10);
        VideoMusical peli3 = new VideoMusical("Arround My Love",4,0.20,"Hana Montana","Pop");
        System.out.println(peli1.toString());
        System.out.println(peli2.toString());
        System.out.println(peli3.toString());
    }

}