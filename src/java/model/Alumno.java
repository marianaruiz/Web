/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author Mariana
 */
@Entity
@Table (name = "Alumno")
public class Alumno{
    @Id
    private String Boleta;
    private String nombre;
    private String paterno;
    private String materno;
    @OneToOne(cascade ={CascadeType.PERSIST, CascadeType.REMOVE})
    private Direcion dir;
    @OneToMany(cascade = CascadeType.ALL ,fetch = FetchType.LAZY )
    private List<email> emails =new ArrayList<email>();
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    @Temporal(TemporalType.TIME)
    private Time fechaHoradeIngreso;
    //private Date fechaIngreso;
    //private Hour horaDeIngreso;

    public Alumno() {
    }
    
    public String getBoleta() {
        return Boleta;
    }

    public void setBoleta(String Boleta) {
        this.Boleta = Boleta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public Direcion getDir() {
        return dir;
    }

    public void setDir(Direcion dir) {
        this.dir = dir;
    }

    public List<email> getEmails() {
        return emails;
    }

    public void setEmails(List<email> emails) {
        this.emails = emails;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Time getFechaHoradeIngreso() {
        return fechaHoradeIngreso;
    }

    public void setFechaHoradeIngreso(Time fechaHoradeIngreso) {
        this.fechaHoradeIngreso = fechaHoradeIngreso;
    }
        
}