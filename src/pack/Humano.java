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

    public Integer beber() {
        return this.getBeber().beber();
    }

    public String orinar() {
        return this.getOrinar().orinar(getNombre());
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

    @Override
    public String toString() {
        return
                "nombre='" + nombre + '\'' +
                        ", edad=" + edad +
                        ", peso=" + peso+",";
    }
}





