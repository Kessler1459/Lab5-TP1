package pack.persistence;

import pack.models.Ganador;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GanadorDaoImpl implements GanadorDao {
    @Override
    public Ganador save(Ganador win) {
        Connection con= DatabaseConnection.getConnection();
        PreparedStatement statement;
        try {
            statement = con.prepareStatement("INSERT INTO ganadores (bebidaEnCuerpo,nombre) VALUES (?,?)");
            statement.setString(1,win.getBebidaEnCuerpo().toString());
            statement.setString(2,win.getNombre());
            statement.execute();
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return win;
    }

    @Override
    public List<Ganador> getAll() {
        Connection con= DatabaseConnection.getConnection();
        Statement statement;
        ResultSet set;
        List<Ganador> ganadores=new ArrayList<>();
        try {
            statement=con.createStatement();
            set=statement.executeQuery("SELECT * FROM ganadores");
            while (set.next()){
                ganadores.add(new Ganador(set.getInt("bebidaEnCuerpo"), set.getString("nombre")));
            }
            con.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return ganadores;
    }
}
