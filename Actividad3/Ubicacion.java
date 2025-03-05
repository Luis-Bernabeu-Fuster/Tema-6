import java.util.HashMap;
import java.util.Map;

public class Ubicacion {
        protected int id;
        protected String desc;
        protected Map<String,Integer> exits = new HashMap<>();

    public Ubicacion(int id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public Map<String, Integer> getExits() {
        return exits;
    }

    public void addExit(String direc,int idUbicacion){
        exits.put(direc,idUbicacion);
    }
}
