import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    static Map<String, CuerpoCeleste> sistemaSolar = new HashMap<>();
    static Set<CuerpoCeleste> planetas = new HashSet<>();

    public static void main(String[] args) {
        CuerpoCeleste Mercurio = new CuerpoCeleste("Mercurio",88, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("1",Mercurio);
        planetas.add(Mercurio);

        CuerpoCeleste Venus = new CuerpoCeleste("Venus",255, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("2",Venus);
        planetas.add(Venus);

        CuerpoCeleste Tierra = new CuerpoCeleste("La Tierra", 365, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("3",Tierra);
        planetas.add(Tierra);

        CuerpoCeleste Marte = new CuerpoCeleste("Marte", 687, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("4",Marte);
        planetas.add(Marte);

        CuerpoCeleste Jupiter = new CuerpoCeleste("Jupiter", 4332, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("5",Jupiter);
        planetas.add(Jupiter);

        CuerpoCeleste Saturno = new CuerpoCeleste("Saturno",10795, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("6",Saturno);
        planetas.add(Saturno);

        CuerpoCeleste Urano = new CuerpoCeleste("Urano",30660, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("7",Urano);
        planetas.add(Urano);

        CuerpoCeleste Neptuno = new CuerpoCeleste("Neptuno",165, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("8",Neptuno);
        planetas.add(Neptuno);

        CuerpoCeleste Pluton = new CuerpoCeleste("Pluton",248, CuerpoCeleste.TipoCuerpoCeleste.PLANETA);
        sistemaSolar.put("9",Pluton);
        planetas.add(Pluton);

        CuerpoCeleste Luna = new CuerpoCeleste("Luna",27, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("10",Luna);
        Tierra.addSatelite(Luna);

        CuerpoCeleste Deimos = new CuerpoCeleste("Deimos",1.3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("11",Deimos);
        Marte.addSatelite(Deimos);
        CuerpoCeleste Phobos = new CuerpoCeleste("Phobos",1.3, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("12",Phobos);
        Marte.addSatelite(Phobos);

        CuerpoCeleste Io = new CuerpoCeleste("Io",1.8, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("13",Io);
        CuerpoCeleste Europa = new CuerpoCeleste("Europa",3.5, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("14",Europa);
        CuerpoCeleste Ganymede = new CuerpoCeleste("Ganymede", 7.1, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("15",Ganymede);
        CuerpoCeleste Callisto = new CuerpoCeleste("Callisto",16.7, CuerpoCeleste.TipoCuerpoCeleste.LUNA);
        sistemaSolar.put("16",Callisto);

        Jupiter.addSatelite(Io);
        Jupiter.addSatelite(Europa);
        Jupiter.addSatelite(Ganymede);
        Jupiter.addSatelite(Callisto);

        for (Object object : planetas){
            System.out.println(object);
        }

        System.out.println("Lunas de Marte: " + "\n=====================");
        System.out.print(sistemaSolar.get("4").getSatelites());
        System.out.println("\n================");
        Set<CuerpoCeleste> lunas = new HashSet<>();

        for (CuerpoCeleste objeto : planetas){
            lunas.addAll(objeto.getSatelites());
        }
        System.out.println("Union de todas las lunas:");
        System.out.println(lunas);


        //Pregunta 10 y 11
        CuerpoCeleste Pluton2= new CuerpoCeleste("Pluton",884, CuerpoCeleste.TipoCuerpoCeleste.PLANETA_ENANO);
        sistemaSolar.put("17", Pluton2);
        planetas.add(Pluton2);

        for (Object object : planetas){
            System.out.println(object);
        }
        //No se agrega porque ya existe un planeta pluton y no se sobrescribe su información
        //Si lo ponemos como planeta enano si que aparecera porque es un tipo diferente de planeta


    }
}
