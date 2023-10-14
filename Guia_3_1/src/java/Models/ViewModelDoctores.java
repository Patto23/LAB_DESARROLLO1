/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author Tania Garcia
 */
public class ViewModelDoctores {
//ATRIBUTOS
    private int ID_Doctor;
    private String nombre;
    private String apellido;
    private String especialidad;
    private Date Fecha_Inicio;
    private Float salario;
   
    /**
     * @return the ID_Doctor
     */
    public int getID_Doctor() {
        return ID_Doctor;
    }

    /**
     * @param ID_Doctor the ID_Doctor to set
     */
    public void setID_Doctor(int ID_Doctor) {
        this.ID_Doctor = ID_Doctor;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the Fecha_Inicio
     */
    public Date getFecha_Inicio() {
        return Fecha_Inicio;
    }

    /**
     * @param Fecha_Inicio the Fecha_Inicio to set
     */
    public void setFecha_Inicio(Date Fecha_Inicio) {
        this.Fecha_Inicio = Fecha_Inicio;
    }

    /**
     * @return the salario
     */
    public Float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(Float salario) {
        this.salario = salario;
    }

    
    
}