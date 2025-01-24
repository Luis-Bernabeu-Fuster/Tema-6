public class Coche {
    protected String modelo;
    protected boolean motor;
    protected int ruedas;
    protected int cilindros;

    public Coche(String modelo, int cilindros) {
        this.modelo = modelo;
        this.cilindros = cilindros;
    }

    public int getRuedas() {
        return ruedas;
    }

    public boolean isMotor() {
        return motor;
    }

    public void arrancar(){
            System.out.println("El vehiculo " + modelo + " arrancar en modo: ");
    }

    public void acelerar(){
        System.out.println("El vehiculo " + modelo + " acelera en modo: ");
    }

    public void frenar(){
        System.out.println("El vehiculo " + modelo + " frena en modo: ");
    }
}

class Combustion extends Coche{
    public Combustion(String modelo, int cilindros) {
        super(modelo, cilindros);
    }

    @Override
    public void arrancar() {
        System.out.println("El vehiculo " + modelo + " arranca en modo combustion");
    }

    @Override
    public void acelerar() {
        System.out.println("El vehiculo " + modelo + " acelera en modo combustion");
    }

    @Override
    public void frenar() {
        System.out.println("El vehiculo " + modelo + " frena en modo combustion");
    }
}

class Electrico extends Coche{
    public Electrico(String modelo, int cilindros) {
        super(modelo, cilindros);
    }

    @Override
    public void arrancar() {
        System.out.println("El vehiculo " + modelo + " arranca en modo electrico");
    }

    @Override
    public void acelerar() {
        System.out.println("El vehiculo " + modelo + " acelera en modo electrico");
    }

    @Override
    public void frenar() {
        System.out.println("El vehiculo " + modelo + " frena en modo electrico");
    }
}

class Hibrido extends Coche{
    public Hibrido(String modelo, int cilindros) {
        super(modelo, cilindros);
    }

    @Override
    public void arrancar() {
        System.out.println("El vehiculo " + modelo + " arranca en modo hibrido");
    }

    @Override
    public void acelerar() {
        System.out.println("El vehiculo " + modelo + " acelera en modo hibrido");
    }

    @Override
    public void frenar() {
        System.out.println("El vehiculo " + modelo + " frena en modo hibrido");
    }
}
