package org.escuela.escuelacompleto.Modelo;

import java.util.Date;

public class duracionCursosModelo {
    private int idDuracion;
    private Date fecha_inicio;
    private Date fecha_final;

    public duracionCursosModelo(int idDuracion, Date fecha_inicio, Date fecha_final) {
        this.idDuracion = idDuracion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
    }

    public int getIdDuracion() {
        return idDuracion;
    }

    public void setIdDuracion(int idDuracion) {
        this.idDuracion = idDuracion;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_final() {
        return fecha_final;
    }

    public void setFecha_final(Date fecha_final) {
        this.fecha_final = fecha_final;
    }
}
