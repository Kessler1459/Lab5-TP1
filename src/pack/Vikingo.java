package pack;

public class Vikingo extends Humano {
    private Integer bebedorProfesional;

    public Vikingo(String nombre, Integer edad, Integer peso, Integer bebedorProfesional, BeberVikingoImpl beber, OrinarVikingoImpl orinar) {
        super(nombre, edad, peso, beber, orinar);
        this.bebedorProfesional = bebedorProfesional;
    }

    public Integer getBebedorProfesional() {
        return bebedorProfesional;
    }

    public void setBebedorProfesional(Integer bebedorProfesional) {
        this.bebedorProfesional = bebedorProfesional;
    }

    @Override
    public String toString() {
        return super.toString() + " bebedorProfesional=" + bebedorProfesional;
    }
}
