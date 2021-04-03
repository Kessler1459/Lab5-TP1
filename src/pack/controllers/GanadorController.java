package pack.controllers;

import pack.models.Ganador;
import pack.persistence.GanadorDaoImpl;

import java.util.List;

public class GanadorController {
    GanadorDaoImpl ganadorDao=new GanadorDaoImpl();

    public Ganador addGanador(Ganador ganador){
        return ganadorDao.save(ganador);
    }

    public List<Ganador> getAll(){
        return ganadorDao.getAll();
    }
}
