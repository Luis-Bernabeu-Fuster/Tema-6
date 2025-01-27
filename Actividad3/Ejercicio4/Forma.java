public class Forma {
    protected String nombre;

    public Forma (String nombre){
        this.nombre = nombre;
    }

    public double getArea(){
        return 0;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}

class Esfera extends Forma{
    protected double radio;

    public Esfera(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return 4*Math.PI*Math.pow(radio,2);
    }
}

class Rectangulo extends Forma{
    protected double largo;
    protected double ancho;

    public Rectangulo(String nombre, double largo, double ancho) {
        super(nombre);
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double getArea() {
        return largo*ancho;
    }
}

class Cilindro extends Forma{
    protected double alto;
    protected double radio;

    public Cilindro(String nombre, double alto, double radio) {
        super(nombre);
        this.alto = alto;
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radio,2)*alto;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "alto=" + alto +
                ", radio=" + radio +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}

class Pintura {
    protected double cobertura;

    public Pintura(double cobertura) {
        this.cobertura = cobertura;
    }

    public double calcularPintura(Forma forma){
        return forma.getArea()/cobertura;
    }
}