package org.escuela.escuelacompleto.Modelo;

public class cursosModelo {
    private int idDatosCursos;
    private String nombreCurso;
    private int idMaestro;

    public cursosModelo(int idDatosCursos, String nombreCurso, int idMaestro) {
        this.idDatosCursos = idDatosCursos;
        this.nombreCurso = nombreCurso;
        this.idMaestro = idMaestro;
    }

    public int getIdDatosCursos() {
        return idDatosCursos;
    }

    public void setIdDatosCursos(int idDatosCursos) {
        this.idDatosCursos = idDatosCursos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getIdMaestro() {
        return idMaestro;
    }

    public void setIdMaestro(int idMaestro) {
        this.idMaestro = idMaestro;
    }
}
