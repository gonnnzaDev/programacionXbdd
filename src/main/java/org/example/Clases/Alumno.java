package org.example.Clases;

public class Alumno {

    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    public Alumno(String nombre, String apellido, String email, int edad) throws RuntimeException {
        if (nombre == null || apellido == null || email == null || edad > 100 || edad < 3) {
            throw new RuntimeException("Surgio un error en la carga de datos");

        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                '}' + "\n";
    }
}
