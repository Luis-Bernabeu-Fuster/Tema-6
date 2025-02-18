import java.util.*;

public class Main {

    public static void imprimirMenu(){
        System.out.println("=============================================\n" +
                "1 – Reproducir siguiente canción en la lista\n" +
                "2 – Reproducir la canción previa de la lista\n" +
                "3 – Repetir la canción actual\n" +
                "4 – Imprimir la lista de canciones en la playlist\n" +
                "5 - Borrar cancion actual de la lista\n"+
                "6 – Imprimir todas las canciones de un album.\n" +
                "7 – Salir de la lista de reproducción.\n" +
                "=============================================\n");
    }

    public static int opcionMenu(){
        boolean fin = false;
        int opc = 0;
        while (!fin){
            System.out.print("Elige una opción: ");
            try {
                opc = scanner.nextInt();
                System.out.println("\n=============================================\n");
            } catch (InputMismatchException e) {
                System.out.println("Escoja una opcion valida (1 - 7)");
                System.out.println("=============================================\n");
                scanner.nextLine();
                break;
            }
            if (opc <= 0 || opc > 7){
                System.out.println("Opción no valida (1 - 7)");
                System.out.println("=============================================\n");
                scanner.nextLine();
            } else {
                fin = true;
            }
        }
        return opc;
    }

    public static void metodoCleaner(ListIterator<Cancion> it,boolean avanza){

        if (!avanza){
            if (it.hasNext()){
                it.next();
                it.previous();
            } else {
               it.previous();
                it.next();

            }
        }else {
            if (it.hasNext()){
                it.previous();
                it.next();
            } else {
               it.previous();
                it.next();
            }
        }
    }

    public static void imprimirPlayList(LinkedList<Cancion> listaReproduccion){
        Iterator<Cancion> it = listaReproduccion.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("\n");
    }

    public static void imprimirAlbums(ArrayList<Album> albums){
        System.out.println("Lista de albums: ");
        for (int i = 0; i < albums.size();i++){
            System.out.println( i+1 + " " + albums.get(i).nombre + " " + albums.get(i).artista);
        }
    }

    public static void cancionesAlbum(ArrayList<Album> albums){
        boolean fin = false;
        int opc = 1;
        while (!fin ) {
            System.out.print("\nElige el album usando su posición: ");
            try {
                opc = scanner.nextInt();
                fin = true;
                System.out.println("\n=============================================\n");
            } catch (InputMismatchException e) {
                System.out.println("Escoja una opcion valida\n");
                System.out.println("=============================================\n");
                scanner.nextLine();
                break;
            }

            try {
                Album al = albums.get(opc);
                System.out.println(al.canciones);

            } catch (IndexOutOfBoundsException ex){
                System.out.println("Opción invalida\n");
                System.out.println("=============================================\n");
                scanner.nextLine();
            }
        }
    }


    public static void play(LinkedList<Cancion> listaReproduccion,ArrayList<Album> albums){
        boolean continuar = true;
        boolean avanza = false;
        int opcion;
        ListIterator<Cancion> it = listaReproduccion.listIterator();
        System.out.println(
                "=========================================================================================\n" +
                "Actualmente reproduciendo: " + listaReproduccion.get(0) +"\n" +
                "=========================================================================================\n");
    metodoCleaner(it,avanza);
        while (continuar) {
            imprimirMenu();
            opcion = opcionMenu();

            switch (opcion) {
                case 1:
                    System.out.println("------ Siguiente cancion en la lista ------");
                    if (!avanza && it.hasNext()) {
                        it.next();
                        System.out.println("Reproduciendo: " + it.next() + "\n");
                        avanza = true;

                    } else if (it.hasNext()) {
                        System.out.println("Reproduciendo: " + it.next() + "\n");

                    }else{
                        System.out.println("No hay más canciones en la lista");
                        avanza = false;
                    }

                    break;

                case 2:
                    System.out.println("\n------ Canción previa en la lista ------");

                    if (avanza && it.hasPrevious()) {
                        it.previous();
                        System.out.println("Reproduciendo: " + it.previous() + "\n");
                        avanza = false;
                    } else if (!avanza && it.hasPrevious()) {
                        System.out.println("Reproduciendo: " + it.previous() + "\n");
                        } else {
                            System.out.println("No hay más canciones previas");
                        }

                    break;

                case 3:

                    System.out.println("\n--- Repetir canción actual ---");

                    if (!avanza){
                        if (it.hasNext()){
                            System.out.println(it.next());
                            it.previous();
                        } else {
                            System.out.println(it.previous());
                            it.next();
                        }
                    }else {
                        if (it.hasNext()){
                            System.out.println(it.previous());
                            it.next();
                        } else {
                            System.out.println(it.previous());
                            it.next();
                        }
                    }

                    break;

                case 4:

                    System.out.println("\n--- Imprimir lista de canciones en la lista ---");

                    imprimirPlayList(listaReproduccion);

                    break;

                case 5:

                    System.out.println("\n --- Borrar cancion actual ---");
                    if (!listaReproduccion.isEmpty()){
                        it.remove();
                        if (it.hasNext()){
                            System.out.println("Reproduciendo: " + it.next());
                            it.previous();
                        } else {
                            System.out.println("Reproduciendo: "+ it.previous());
                        }
                    }
                    break;

                case 6:

                    System.out.println("\n --- Imprimir todas las canciones del album ---");
                    imprimirAlbums(albums);
                    cancionesAlbum(albums);
                    System.out.println("\n");
                    break;
                case 7:

                    System.out.println("Saliendo del programa");
                    continuar = false;
                    break;
            }
        }
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Album album1 = new Album("Buenas noches","Quevedo");
        Album album2 = new Album("Origin","Imagin Dragons");

        album1.addSong("Gran Via",3.34);
        album1.addSong("KASSANDRA",3.29);
        album1.addSong("CHAPIADORA.COM",3.22);
        album1.addSong("POR ATRAS",2.57);
        album1.addSong("HALO",3.06);

        album2.addSong("Boomerang", 3.08);
        album2.addSong("Natural",3.10);
        album2.addSong("Bad Liar", 4.21);
        album2.addSong("West Coast",3.38);
        album2.addSong("Bullet In A Gun",3.25);

        ArrayList<Album> albums = new ArrayList<>();
        albums.add(album1);
        albums.add(album2);

        LinkedList<Cancion> listaReproduccion = new LinkedList<>();
        album1.addToPlayList(1,listaReproduccion);
        album2.addToPlayList("Natural",listaReproduccion);
        album1.addToPlayList(3,listaReproduccion);
        album1.addToPlayList("HALO",listaReproduccion);

        play(listaReproduccion,albums);
    }
}
