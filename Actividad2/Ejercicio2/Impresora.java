import java.util.Scanner;

public class Impresora {
    private int nivelToner;
    private int NumeroPaginasImpresas;
    private boolean ImprimeAdobleCara;

    public Impresora(int nivelToner, int numeroPaginasImpresas, boolean imprimeAdobleCara) {
        this.nivelToner = nivelToner;
        NumeroPaginasImpresas = numeroPaginasImpresas;
        ImprimeAdobleCara = imprimeAdobleCara;
    }

    public int getNivelToner() {

        nivelToner = Toner() + nivelToner;

        if (nivelToner >= 0 & nivelToner <= 100){
            System.out.println("Cantidad de toner " + nivelToner +"% . Cantidad adecuada");
            return nivelToner;
        } else if (nivelToner > 100) {
            nivelToner = 100;
            return nivelToner;
        } else {
            return -1;
        }
    }

    public void setNivelToner(int nivelToner) {
        this.nivelToner = nivelToner;
    }

    public int getNumeroPaginasImpresas() {
        NumeroPaginasImpresas = HojasNecesarias();
        return NumeroPaginasImpresas;
    }

    public void setNumeroPaginasImpresas(int numeroPaginasImpresas) {
        NumeroPaginasImpresas = numeroPaginasImpresas;
    }

    public boolean isImprimeAdobleCara() {
        return ImprimeAdobleCara;
    }

    public void setImprimeAdobleCara(boolean imprimeAdobleCara) {
        ImprimeAdobleCara = imprimeAdobleCara;
    }

    private int Toner(){
        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        boolean fin = false;
        String resp = "";

        System.out.print("Cantidad actual de toner: "+ nivelToner +"\nDesea añadir más toner a la impresora(S/N): ");
        resp = sc.next();
        if (resp.equalsIgnoreCase("s")) {
            do {
                System.out.print("Introduzca cuanta cantidad de toner desea añadir(0-100): ");
                cantidad = sc.nextInt();
                if (cantidad > 100 | cantidad < 0) {
                    System.out.println("Esa cantidad no es valida");
                } else {
                    fin = true;
                }
            } while (!fin);
            return cantidad;
        } else {
            return cantidad;
        }
    }

    private int HojasNecesarias(){
        int hojas = 0;
        System.out.println("Analizando cantidad de hojas necesaria . . .");
        if (isImprimeAdobleCara()){
            hojas = this.NumeroPaginasImpresas/2 + this.NumeroPaginasImpresas%2;
            System.out.println("Se necesitan: " + hojas + " hojas\n");
            return hojas;
        } else {
            hojas = this.NumeroPaginasImpresas;
            System.out.println("Se necesitan: " + hojas + " hojas\n");
            return hojas;
        }
    }
    @Override
    public String toString() {
        return "Impresora{" +
                "nivelToner= " + nivelToner + "%" +
                ", \nNumeroPaginasImpresas= " + NumeroPaginasImpresas +
                ", \nImprimeAdobleCara= " + ImprimeAdobleCara +
                '}';
    }
}
