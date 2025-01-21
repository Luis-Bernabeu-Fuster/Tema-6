public class Lampara {
    private String estilo;
    private boolean bateria;
    private int calificacion;

    public Lampara(String estilo, boolean bateria, int calificacion) {
        this.estilo = estilo;
        this.bateria = bateria;
        this.calificacion = calificacion;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public boolean isBateria() {
        return bateria;
    }

    public void setBateria(boolean bateria) {
        this.bateria = bateria;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void encender(){
        if (isBateria()) {
            System.out.println("La lamapara se ha encendido");
        } else {
            System.out.println("La lampara esta apagada");
        }
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "estilo='" + estilo + '\'' +
                ", bateria=" + bateria +
                ", calificacion=" + calificacion +
                '}';
    }
}
