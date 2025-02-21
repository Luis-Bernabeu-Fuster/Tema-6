import Clases.*;

import java.util.ArrayList;

public class Metodos {

    protected ArrayList<Heroe> heroes = new ArrayList<>();
    protected ArrayList<Arma> arsenalG = new ArrayList<>();
    protected ArrayList<Arma> arsenalM = new ArrayList<>();
    protected ArrayList<Arma> arsenalAr = new ArrayList<>();
    protected ArrayList<Arma> arsenalAs = new ArrayList<>();
    public Metodos() {
        this.heroes = heroes;
        this.arsenalG = arsenalG;
        this.arsenalM = arsenalM;
        this.arsenalAr = arsenalAr;
        this.arsenalAs = arsenalAs;
    }

    public static void OpcionesMenu(){
        System.out.println("1. Añadir Héroe al Gremio\n" +
                "2. Añadir Armas al Arsenal\n" +
                "3. Eliminar Héroe del Gremio\n" +
                "4. Buscar Héroe\n" +
                "5. Lista de Héroes del Gremio\n" +
                "6. Salir");
    }

    public void iniciaArmas(){
        this.arsenalG.add(0,Arma.createArma("Espada oxidada",5));
        this.arsenalG.add(1,Arma.createArma("Mazo de madera",5));
        this.arsenalM.add(0,Arma.createArma("Grimorio basico",5));
        this.arsenalM.add(1,Arma.createArma("Baculo roto",5));
        this.arsenalAr.add(0,Arma.createArma("Arco corto",5));
        this.arsenalAr.add(1,Arma.createArma("Cervatana",5));
        this.arsenalAs.add(0,Arma.createArma("Daga corta",5));
        this.arsenalAs.add(1,Arma.createArma("Cuchillo de caza",5));
    }
    public void listaClases(){
        System.out.println("Clases: \n" +
                            "   1. Guerrero\n" +
                            "   2. Mago\n" +
                            "   3. Arquero\n" +
                            "   4. Asesino");
    }

    public void listasArsenalG(){ //Lista el arsenal del guerrero

        for (int i = 0; i < this.arsenalG.size(); i++){
            System.out.println(i+1 + ". " + this.arsenalG.get(i).toString());
        }
    }
    public void listasArsenalM(){ //Lista el arsenal del

        for (int i = 0; i < this.arsenalM.size(); i++){
            System.out.println(i+1 + ". " + this.arsenalM.get(i).toString());
        }
    }
    public void listasArsenalAr(){ //Lista el arsenal del
        for (int i = 0; i < this.arsenalAr.size(); i++){
            System.out.println(i+1 + ". " +  this.arsenalAr.get(i).toString());
        }
    }
    public void listasArsenalAs(){ //Lista el arsenal del

        for (int i = 0; i < this.arsenalAs.size(); i++){
            System.out.println(i+1 + ". " + this.arsenalAs.get(i).toString());
        }
    }

    public Arma armaelegida(int clas,int elig){ //Comprueba que arma se elige y la selecciona
        if (clas == 1 ){
                return this.arsenalG.get(elig -1);
        } else if (clas == 2) {
                return this.arsenalM.get(elig -1);
        } else if (clas == 3) {
                return this.arsenalAr.get(elig -1);
        } else if (clas == 4) {
                return this.arsenalAs.get(elig -1);
        }
        return null;
    }

    public void imprimeArsenalConcreto(int clase){ //Imprime el arsenal dependiendo de la clase elegida
        if (clase == 1){
            listasArsenalG();
        } else if (clase == 2) {
            listasArsenalM();
        } else if (clase == 3) {
            listasArsenalAr();
        } else if (clase == 4) {
            listasArsenalAs();
        }
    }

    public boolean addHeroe(Guerrero guerrero, Mago mago, Arquero arquero, Asesino asesino, int clase){
        if (clase == 1){
            if (findHeroe(guerrero.getNombre())) { //Comprueba si existe mediante el nombre
                return false;
            } else {
                this.heroes.add(guerrero); //Si el guerrero no existe se añade al gremio
                return true;
            }
        } else if (clase == 2) {
            if (findHeroe(mago.getNombre())) { //Comprueba si existe mediante el nombre
                return false;
            } else {
                this.heroes.add(mago); //Si el mago no existe se añade al gremio
                return true;
            }
        } else if (clase == 3) {
            if (findHeroe(arquero.getNombre())) { //Comprueba si existe mediante el nombre
                return false;
            }else {
                this.heroes.add(arquero); //Si el arquero no existe se añade al gremio
                return true;
            }
        } else if (clase == 4) {
            if (findHeroe(asesino.getNombre())) { //Comprueba si existe mediante el nombre
                return false;
            }else {
                this.heroes.add(asesino); //Si el asesino no existe se añade al gremio
                return true;
            }
        } else {
            return false;
        }
    }

    public boolean addArsenalG(Arma arma){
        int g = 1;
        if (findArma(arma.getNombre(),g)){ //Comprueba si existe mediante el nombre
            return false;
        } else {
            this.arsenalG.add(arma); //Si el arma no existe se añade al guerrero
            return true;
        }
    }
    public boolean addArsenalM(Arma arma){
        int m = 2;
        if (findArma(arma.getNombre(),m)){ //Comprueba si existe mediante el nombre
            return false;
        } else {
            this.arsenalM.add(arma); //Si el arma no existe se añade al mago
            return true;
        }
    }
    public boolean addArsenalAr(Arma arma){
        int ar = 3;
        if (findArma(arma.getNombre(),ar)){ //Comprueba si existe mediante el nombre
            return false;
        } else {
            this.arsenalAr.add(arma); //Si el arma no existe se añade al arquero
            return true;
        }
    }
    public boolean addArsenalAs(Arma arma){
        int as = 3;
        if (findArma(arma.getNombre(),as)){ //Comprueba si existe mediante el nombre
            return false;
        } else {
            this.arsenalAs.add(arma); //Si el arma no existe se añade al asesino
            return true;
        }
    }

    private boolean findHeroe(String nombre){ //Busca si ya existe algun hereo mediante el nombre
        for (int i = 0; i < this.heroes.size(); i++){
            if (this.heroes.get(i).getNombre().equalsIgnoreCase(nombre)){
                return true;
            }
        }
        return false;
    }

    private boolean findArma(String nombre, int tipo){ //Busca si ya existe esa arma en su respectiva clase mediante el nombre
        if (tipo == 1){
            for (int i = 0; i < this.arsenalG.size(); i++){
                if (this.arsenalG.get(i).getNombre().equalsIgnoreCase(nombre)){
                    return true;
                }
            }
        } else if (tipo == 2) {
            for (int i = 0; i < this.arsenalM.size(); i++){
                if (this.arsenalM.get(i).getNombre().equalsIgnoreCase(nombre)){
                    return true;
                }
            }
        } else if (tipo == 3) {
            for (int i = 0; i < this.arsenalAr.size(); i++){
                if (this.arsenalAr.get(i).getNombre().equalsIgnoreCase(nombre)){
                    return true;
                }
            }
        } else if (tipo == 4) {
            for (int i = 0; i < this.arsenalAs.size(); i++){
                if (this.arsenalAs.get(i).getNombre().equalsIgnoreCase(nombre)){
                    return true;
                }
            }
        }
        return false;
    }

    public void printHeroes(){ //Imprime la lista de Héroes con sus armas
        for (int i = 0; i < this.heroes.size(); i++){
            System.out.println(this.heroes.get(i).toString()+"\n" +
                    "-------------------------------------------------");
        }
        System.out.println("==========================================================\n");
    }

    public Heroe queryHeroe(String nombre){
        for (int i = 0; i < this.heroes.size(); i++){
            if (this.heroes.get(i).getNombre().equalsIgnoreCase(nombre)){
                return  this.heroes.get(i);
            }
        }
        return null;
    }

    public boolean removeHeroe( Heroe heroe){
        if (this.heroes.contains(heroe)){
            this.heroes.remove(heroe);
            System.out.println("Rtirando al Héroe de las listas del gremio");
            return true;
        } else {
            System.out.println("Ese Héroe no aparece entre las filas del gremio");
            return false;
        }
    }
}
