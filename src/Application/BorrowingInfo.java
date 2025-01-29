/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

/**
 *
 * @author labso20
 */
public class BorrowingInfo {
    private String numInventario;
    private String nombrePersona;
    private String apellidoPersona;
    private String grupoPersona;
    private String fechaInicio;
    private String fechaFin;
    private String prestatario;

    public BorrowingInfo(String numInventario, String nombrePersona, String apellidoPersona, String grupoPersona, String fechaInicio, String fechaFin, String prestatario) {
        this.numInventario = numInventario;
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.grupoPersona = grupoPersona;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.prestatario = prestatario;
    }

    public String getNumInventario() {
        return numInventario;
    }

    public void setNumInventario(String numInventario) {
        this.numInventario = numInventario;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public String getGrupoPersona() {
        return grupoPersona;
    }

    public void setGrupoPersona(String grupoPersona) {
        this.grupoPersona = grupoPersona;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getPrestatario() {
        return prestatario;
    }

    public void setPrestatario(String prestatario) {
        this.prestatario = prestatario;
    }
    
    
}
