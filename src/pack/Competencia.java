package pack;

import pack.controllers.GanadorController;
import pack.models.Espartano;
import pack.models.Ganador;
import pack.models.Vikingo;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Competencia {
    List<Vikingo> vikingos;
    List<Espartano> espartanos;

    public Competencia(List<Vikingo> vikingos, List<Espartano> espartanos) {
        Collections.sort(vikingos);
        Collections.reverse(vikingos);
        Collections.sort(espartanos);
        Collections.reverse(espartanos);
        this.vikingos = vikingos;
        this.espartanos = espartanos;
    }

    public void iniciar() {
        Random rand = new Random();
        Vikingo vik = vikingos.get(rand.nextInt(vikingos.size()));
        Espartano esp = espartanos.get(rand.nextInt(espartanos.size()));
        System.out.println("Vikingo elegido: \n" + vik.toString());
        System.out.println("Espartano elegido: \n" + esp.toString() + "\n");
        competir(vik,esp);
    }

    private void competir(Vikingo vik, Espartano esp){
        Integer vikBeb = vik.beber() + vik.getBebedorProfesional();
        Integer espBeb = esp.beber() + esp.getToleranciaExtra();
        Ganador ganador;
        if (vikBeb > espBeb) {
            ganador=new Ganador(vikBeb-espBeb,vik.getNombre());
            System.out.println(esp.orinar());
            System.out.println("\n Ganan los vikingos");
        } else {
            ganador=new Ganador(espBeb-vikBeb,esp.getNombre());
            System.out.println(vik.orinar());
            System.out.println("\n Ganan los espartanos");
        }
        new GanadorController().addGanador(ganador);
    }


}
