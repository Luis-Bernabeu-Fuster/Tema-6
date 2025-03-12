public class Planeta extends CuerpoCeleste{

    public Planeta(String nombre, double periodoOrbital) {
        super(nombre, periodoOrbital, TipoCuerpoCeleste.PLANETA);

    }

    public boolean addSatelite (CuerpoCeleste satelite){
        if (satelite.getTipoCuerpo().equals(TipoCuerpoCeleste.LUNA)){
             return addSatelite(satelite);
        } else {
            return false;
        }
    }
}
