public class MainPintura {
    public static void main(String[] args) {
        Pintura pintura1 = new Pintura(250);

        Forma esfera = new Esfera("Esfera",15);
        Forma rectangulo = new Rectangulo("Rectangulo",20,35);
        Forma cilindro = new Cilindro("Cilindro",30,10);

        System.out.println(pintura1.calcularPintura(rectangulo));
        System.out.println(pintura1.calcularPintura(esfera));
        System.out.println(pintura1.calcularPintura(cilindro));
    }
}
