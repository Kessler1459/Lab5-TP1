package pack;

import java.util.List;
import java.util.Random;

public class Competencia {
    List<Vikingo> vikingos;
    List<Espartano> espartanos;

    public Competencia(List<Vikingo> vikingos, List<Espartano> espartanos) {
        this.vikingos = vikingos;
        this.espartanos = espartanos;
    }

    public void iniciar() {
        Random rand = new Random();
        Vikingo vik = vikingos.get(rand.nextInt(vikingos.size()));
        Espartano esp = espartanos.get(rand.nextInt(espartanos.size()));
        System.out.println("Vikingo elegido: \n" + vik.toString());
        System.out.println("Espartano elegido: \n" + esp.toString() + "\n");
        Integer vikBeb = vik.beber() + vik.getBebedorProfesional();
        Integer espBeb = esp.beber() + esp.getToleranciaExtra();
        if (vikBeb > espBeb) {
            System.out.println(esp.orinar());
            System.out.println("\n Ganan los vikingos");
        } else {
            System.out.println(vik.orinar());
            System.out.println("\n Ganan los espartanos");
        }
    }
}
