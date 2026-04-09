package org.example.Controlador;

import org.example.Clases.Alumno;
import org.example.Modelo.ConnectionSQL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlumnoController {

    //punto1
    public static void add(Alumno a) throws SQLException {

        String consulta = "Insert into alumnos(nombre,apellido,edad,email) " +
                "values(?,?,?,?)";

        try {

            PreparedStatement repo = ConnectionSQL.getInstancia()
                    .getConnection().prepareStatement(consulta);


            repo.setString(1, a.getNombre());
            repo.setString(2, a.getApellido());
            repo.setInt(3, a.getEdad());
            repo.setString(4, a.getEmail());


            repo.execute();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

    }


    public static int countAlumnos() {

        String consulta = "select count(id) from alumnos ";
        int c = 0;

        try {

            Statement repo = ConnectionSQL.getInstancia().getConnection().createStatement();
            ResultSet rs = repo.executeQuery(consulta);
            while (rs.next()) {

                c = rs.getInt(1);

            }


        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return c;
    }

    public static void remove(int id) {
        String consulta = "delete from alumnos where id = ?" ;


        try {
            PreparedStatement repo = ConnectionSQL.getInstancia().getConnection().prepareStatement(consulta);


            repo.setInt(1, id);

            repo.execute();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }


    }


    public static List<Alumno> toLIst() {

        String consulta = "Select * from alumnos ";
        List<Alumno> list = new ArrayList<>();

        try {

            Statement repo = ConnectionSQL.getInstancia().getConnection().createStatement();
            ResultSet rs = repo.executeQuery(consulta);


            while (rs.next()) {
                Alumno a = new Alumno(
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("email"),
                        rs.getInt("edad")
                );
                list.add(a);

            }
            return list;


        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return null;
    }


    public static void updateEdad(int edad, int id) {

        String cons = "update alumnos set edad = ? where id = ?";

        try {
            PreparedStatement repo = ConnectionSQL.getInstancia().getConnection().prepareStatement(cons);

            repo.setInt(1, edad);
            repo.setInt(2, id);

            repo.execute();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }


    }


}
