package pack;

public class Espartano extends Humano {
    private Integer toleranciaExtra;

    public Espartano(String nombre, Integer edad, Integer peso, Integer toleranciaExtra, BeberEspartanoImpl beber, OrinarEspartanoImpl orinar) {
        super(nombre, edad, peso, beber, orinar);
        this.toleranciaExtra = toleranciaExtra;
    }

    public Integer getToleranciaExtra() {
        return toleranciaExtra;
    }

    public void setToleranciaExtra(Integer toleranciaExtra) {
        this.toleranciaExtra = toleranciaExtra;
    }

    @Override
    public String toString() {
        return super.toString() + " toleranciaExtra=" + toleranciaExtra;
    }
}
