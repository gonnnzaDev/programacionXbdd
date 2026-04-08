package org.example;

import org.example.Clases.Alumno;
import org.example.Controlador.AlumnoController;
import org.example.Vista.Menu;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        try {
            System.out.println("Bienvenido :3");
            //Menu.punto2();
            //Menu.punto3();
            //Menu.punto7(3);

            //Menu.punto8(3);
            //Menu.punto4();
            //Menu.punto5();
            Menu.punto6();

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());;
        }

    }


}
