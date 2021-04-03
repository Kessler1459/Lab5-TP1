package pack;

import pack.controllers.GanadorController;
import pack.models.Espartano;
import pack.models.Vikingo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Vikingo> vikingos=new ArrayList<Vikingo>();
        vikingos.add(new Vikingo("Cosme",34,70,4,new BeberVikingoImpl(),new OrinarVikingoImpl()));
        vikingos.add(new Vikingo("Fulanito",24,40,1,new BeberVikingoImpl(),new OrinarVikingoImpl()));
        vikingos.add(new Vikingo("Esteban",64,50,2,new BeberVikingoImpl(),new OrinarVikingoImpl()));
        vikingos.add(new Vikingo("Quito",14,80,7,new BeberVikingoImpl(),new OrinarVikingoImpl()));
        System.out.println(vikingos);
        List<Espartano> espartanos=new ArrayList<Espartano>();
        espartanos.add(new Espartano("Armando",23,65,3,new BeberEspartanoImpl(),new OrinarEspartanoImpl()));
        espartanos.add(new Espartano("Barreda",45,87,2,new BeberEspartanoImpl(),new OrinarEspartanoImpl()));
        espartanos.add(new Espartano("Max Power",26,103,8,new BeberEspartanoImpl(),new OrinarEspartanoImpl()));
        Competencia competencia=new Competencia(vikingos,espartanos);
        competencia.iniciar();
    }
}
