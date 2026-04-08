package org.example.Clases;

import org.example.Controlador.AlumnoController;

public class Direccion {


    private String calle;
    private Integer altura;
    private Integer alumnoId;

    public Direccion(String calle, Integer altura, Integer alumnoId) {
        if (calle == null || altura < 0 || (alumnoId < 0 && alumnoId > AlumnoController.countAlumnos()) ) {
            throw new RuntimeException("Surgio un error en la carga de datos");
        }
        this.calle = calle;
        this.altura = altura;
        this.alumnoId = alumnoId;
    }

    public String getCalle() {
        return calle;
    }

    public Integer getAltura() {
        return altura;
    }

    public Integer getAlumnoId() {
        return alumnoId;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", altura=" + altura +
                ", alumnoId=" + alumnoId +
                '}' + "\n";
    }
}
