package pack.models;

public class Ganador {
    Integer bebidaEnCuerpo;
    String nombre;

    public Ganador(Integer bebidaEnCuerpo, String nombre) {
        this.bebidaEnCuerpo = bebidaEnCuerpo;
        this.nombre = nombre;
    }

    public Integer getBebidaEnCuerpo() {
        return bebidaEnCuerpo;
    }

    public void setBebidaEnCuerpo(Integer bebidaEnCuerpo) {
        this.bebidaEnCuerpo = bebidaEnCuerpo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ganador{" +
                "bebidaEnCuerpo=" + bebidaEnCuerpo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
