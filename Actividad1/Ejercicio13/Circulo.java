public class Circulo {
    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        if (radio < 0){
            radio = 0;
            return radio;
        } else {
            return radio;
        }
    }

    public double getArea() {
        double area;
        area = (radio*radio*Math.PI);
        return area;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}

class Cilindro extends Circulo {
    protected double altura;

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }

    public double getAltura() {
        if (this.altura < 0) {
            this.altura = 0;
            return this.altura;
        }else {
            return this.altura;
        }
    }

    public double getVolumen(){
        double volumen;
        double area = (this.radio*this.radio*Math.PI);
        volumen = this.altura * area;
        return volumen;
    }

    @Override
    public String toString() {
        return "Cilindro{" +
                "altura= " + altura +
                ", radio= " + radio +
                ", volumen= " + getVolumen() +
                '}';
    }
}
