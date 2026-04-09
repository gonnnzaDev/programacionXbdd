package org.example.Controlador;

import org.example.Clases.Direccion;
import org.example.Modelo.ConnectionSQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DireccionController {


    public static void add(Direccion d) {

        String consulta = "insert into direcciones(calle,altura,alumno_id) values (?,?,?)";

        try {

            PreparedStatement repo = ConnectionSQL.getInstancia()
                    .getConnection().prepareStatement(consulta);

            repo.setString(1, d.getCalle());
            repo.setInt(2, d.getAltura());
            repo.setInt(3, d.getAlumnoId());

            repo.execute();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }


    }


    public static void remove(int id) {

        String consulta = "Delete from direcciones where id = ? ";


        try {
            PreparedStatement repo = ConnectionSQL.getInstancia().getConnection().prepareStatement(consulta);

            repo.setInt(id);

            repo.execute();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }

    public static List<Direccion> toList() {

        String cons = "select * from direcciones";
        List<Direccion> direcciones = new ArrayList<>();


        try {
            Statement repo = ConnectionSQL.getInstancia().getConnection().createStatement();

            ResultSet rs = repo.executeQuery(cons);


            while (rs.next()) {

                Direccion direccion = new Direccion(

                        rs.getString("calle"),
                        rs.getInt("altura"),
                        rs.getInt("alumno_id")


                );
                direcciones.add(direccion);


            }

            return direcciones;

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

}
