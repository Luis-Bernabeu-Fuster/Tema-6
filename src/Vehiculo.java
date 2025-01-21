import java.util.Scanner;

public class  Vehiculo{
    String Nombre;
    int Velocidad;

    public Vehiculo(String nombre, int velocidad) {
        Nombre = nombre;
        Velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                ", Nombre='" + Nombre + '\'' +
                ", Velocidad=" + Velocidad + " K/h" +
                '}';
    }

    public void movimiento(String respuesta){
        Scanner sc = new Scanner(System.in);
        boolean termina = false;
        int nav;

        do {
            if (respuesta.equalsIgnoreCase("s")){
                nav = 1;
            } else if (respuesta.equalsIgnoreCase("n")) {
                nav = 2;
            } else {
                nav = 3;
            }

            switch (nav) {
                case 1:
                    System.out.println("El coche se mueve");
                    break;
                case 2:
                    System.out.println("El coche se detuvo");
                    break;
                case 3:
                    System.out.println("Aparcando el coche");
                    termina = true;
                    break;
            }
            System.out.print("El coche hace algo más (S/N/P): ");
            respuesta = sc.next();

        }while (!termina);
    }
}

class Coche extends Vehiculo{
    String Marca;
    String Modelo;
    int ruedas;

    public Coche(String nombre, int velocidad, String marca, String modelo, int ruedas) {
        super(nombre, velocidad);
        Marca = marca;
        Modelo = modelo;
        this.ruedas = ruedas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", ruedas=" + ruedas +
                ", Nombre='" + Nombre + '\'' +
                ", Velocidad=" + Velocidad + " K/h" +
                '}';
    }
}

class Combustion extends Coche{
    int Marchas;

    public Combustion(String nombre, int velocidad, String marca, String modelo, int ruedas, int marchas) {
        super(nombre, velocidad, marca, modelo, ruedas);
        this.Marchas = marchas;
    }

    @Override
    public String toString() {
        return "Combustion " +
                " Marchas= " + Marchas +
                ", Marca= " + Marca +
                ", Modelo= " + Modelo +
                ", Ruedas= " + ruedas +
                ", Marchas= " + Marchas +
                ", Nombre= " + Nombre +
                ", Velocidad= " + Velocidad + " K/h";
    }

    public void CambioDeMarcha(int num){
        Scanner sc = new Scanner(System.in);
        boolean fin = false;
        String respuesta;
        int menuOp = 0;

        do {
            Marchas = num;
            if (num >= 1 & num <= 5){
                menuOp = 1;
            } else if (num == 6) {
                menuOp = 6;
            }

            switch (menuOp) {
                case 1:
                    System.out.println("El vehiculo " + Marca + " " + Modelo + " va en " + Marchas);
                    break;
                case 6:
                    System.out.println("El vehiculo " + Marca + " " + Modelo + " va en reversa");
                    break;
                default:
                    System.out.println("Marcha invalida");
            }
            sc.nextLine();
            System.out.println("Desea cambiar de marcha(S/N):");
            respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("S")){
                System.out.println("Introduzca marcha nueva(1-5)(6 = R):");
                num = sc.nextInt();
            } else {
                System.out.println("El viaje prosiguio en " + Marchas + " marcha");
                fin = true;
            }
        }while (!fin);
    }
}

class Electrico extends Coche{
    int Autonomia;

    public Electrico(String nombre, int velocidad, String marca, String modelo, int ruedas, int autonomia) {
        super(nombre, velocidad, marca, modelo, ruedas);
        Autonomia = autonomia;
    }

    @Override
    public String toString() {
        return "Electrico{" +
                "Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", ruedas=" + ruedas +
                ", Autonomia=" + Autonomia +
                ", Nombre='" + Nombre + '\'' +
                ", Velocidad=" + Velocidad + " K/h" +
                ",No tiene marchas";
    }
}