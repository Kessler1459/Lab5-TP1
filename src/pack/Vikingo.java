package pack;

public class Vikingo extends Humano {
    private Integer bebedorProfesional;

    public Vikingo(String nombre, Integer edad, Integer peso, Integer bebedorProfesional) {
        super(nombre, edad, peso, new BeberVikingoImpl(), new OrinarVikingoImpl());
        this.bebedorProfesional = bebedorProfesional;
    }

    public Integer getBebedorProfesional() {
        return bebedorProfesional;
    }

    public void setBebedorProfesional(Integer bebedorProfesional) {
        this.bebedorProfesional = bebedorProfesional;
    }
}
