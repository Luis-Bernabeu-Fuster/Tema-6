public class MainImpresora {
    public static void main(String[] args) {
        Impresora imprimir = new Impresora(12,2,true);

        imprimir.getNivelToner();
        System.out.println("");
        imprimir.getNumeroPaginasImpresas();
        System.out.println(imprimir);
    }
}
