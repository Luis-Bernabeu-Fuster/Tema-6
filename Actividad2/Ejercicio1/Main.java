public class Main {
    public static void main(String[] args) {

        Lampara lampara = new Lampara("Moderno",false,3);
        Cama cama = new Cama("Coche",2,1,2,1);
        Techo techo = new Techo(2,"Verde Pistacho");
        Pared pared1 = new Pared("Norte");
        Pared pared2 = new Pared("Sur");
        Pared pared3 = new Pared("Este");
        Pared pared4 = new Pared("Oeste");

        Habitacion habitacion = new Habitacion("Habitacion para Niño", pared1,pared2,pared3,pared4,techo,cama,lampara);
        habitacion.getLampara().encender();
        habitacion.hacerLaCama();

        System.out.println(habitacion);
    }
}