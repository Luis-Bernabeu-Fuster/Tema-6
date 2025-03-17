import java.util.HashMap;
import java.util.Map;

public class Mapa {
    protected static Map<String,Paradas> A = new HashMap<>();
    protected static Map<String, Paradas> F = new HashMap<>();
    protected static Map<String,Paradas> I = new HashMap<>();
    protected static Map<String,Paradas> J = new HashMap<>();

    public static void lineas() {
        A.put("001",new Paradas("Doctor Caro","C/Doctor Caro"));
        A.put("002",new Paradas("V.B. Ibañez, 22",""));
        A.put("003",new Paradas("V.B. Ibañez, 80",""));
        A.put("004",new Paradas("INEM Carrus",""));
        A.put("005",new Paradas("P. Moreno Sastre, 62",""));

        F.put("002",new Paradas("V.B. Ibañez, 22",""));
        F.put("115",new Paradas("Centro - A.C.Valenciana",""));
        F.put("056",new Paradas("Cristobal Sanz",""));
        F.put("089",new Paradas("AV. Libertad, 11",""));
        F.put("090",new Paradas("Renfe - Parque Municipal",""));

        I.put("003",new Paradas("V.B. Ibañez, 80",""));
        I.put("071",new Paradas("Jorge Juan - R.Victoria",""));
        I.put("335",new Paradas("Gabriel Miro",""));
        I.put("346",new Paradas("Paseo De Germanias",""));
        I.put("347",new Paradas("F.Garcia Lorca - Asilo",""));

        J.put("115",new Paradas("Centro - A.C.Valenciana",""));
        J.put("002",new Paradas("V.B. Ibañez, 22",""));
        J.put("089",new Paradas("AV. Libertad, 11",""));
        J.put("090",new Paradas("Renfe - Parque Municipal",""));
        J.put("117",new Paradas("V.Cabeza - H.Pensionista",""));
    }
    public static void tiempo(){
        int a001 = 75;
        int a002 = 60;
        int a003 = 40;
        int a004 = 50;
        int a005 = 80;
        int i003 = 50;
        int i071 = 100;
        int i335 = 70;
        int i346 = 50;
        int i347 = 120;
        int j115 = 125;
        int j002 = 75;
        int j089 = 40;
        int j090 = 80;
        int j117 = 40;
        int f115 = 125;
        int f002 = 45;
        int f056 = 40;
        int f089 = 75;
        int f090 = 70;
    }
}
