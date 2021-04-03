package pack.persistence;

import pack.models.Ganador;

import java.util.List;

public interface GanadorDao {
    Ganador save(Ganador win);

    List<Ganador> getAll();
}

