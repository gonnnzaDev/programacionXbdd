package org.example.Vista;

import org.example.Clases.Alumno;
import org.example.Clases.Direccion;
import org.example.Controlador.AlumnoController;
import org.example.Controlador.DireccionController;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {

    public static Scanner sc = new Scanner(System.in);

    public static void punto2() throws SQLException {


        System.out.println("===========Punto 1 ===========");

        System.out.println("Nombre ");
        String nombre = sc.nextLine();
        System.out.println("Apellido");
        String apellido = sc.nextLine();
        System.out.println("Edad");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Email");
        String email = sc.nextLine();


        Alumno alumno = new Alumno(nombre, apellido, email, edad);
        AlumnoController.add(alumno);

    }

    public static void punto3() throws SQLException {

        System.out.println("===========Punto 2===========");

        System.out.println("Calle ");
        String calle = sc.nextLine();


        System.out.println("Altura");
        int altura = sc.nextInt();
        sc.nextLine();

        System.out.println("ID_ALUMNO");
        int idAlumno = sc.nextInt();
        sc.nextLine();


        Direccion direccion = new Direccion(calle, altura, idAlumno);

        DireccionController.add(direccion);


    }

    public static void punto4() throws SQLException {

        System.out.println(AlumnoController.toLIst());

    }

    public static void punto5() throws SQLException {


        System.out.println(DireccionController.toList());


    }

    public static void punto6() throws SQLException {

        System.out.println("Elija cual alumno le va a actualizar la edad");

        System.out.println("ID");
        Integer id = sc.nextInt();
        sc.nextLine();
        System.out.println("EDAD");
        Integer edad = sc.nextInt();
        sc.nextLine();

        AlumnoController.updateEdad(edad, id);

    }


    public static void punto7(Integer id) throws SQLException {
        AlumnoController.remove(id);
    }

    public static void punto8(Integer id) throws SQLException {
        DireccionController.remove(id);
    }

}
