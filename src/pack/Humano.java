package pack;

public abstract class Humano {
    private String nombre;
    private Integer edad;
    private Integer peso;
    private Beber beber;
    private Orinar orinar;

    public Humano(String nombre, Integer edad, Integer peso, Beber beber, Orinar orinar) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.beber = beber;
        this.orinar = orinar;
    }

    public void beber(){
        this.getBeber().beber();
    }

    public void orinar(){
        this.getOrinar().orinar();
    }

    public Beber getBeber() {
        return beber;
    }

    public void setBeber(Beber beber) {
        this.beber = beber;
    }

    public Orinar getOrinar() {
        return orinar;
    }

    public void setOrinar(Orinar orinar) {
        this.orinar = orinar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
}





