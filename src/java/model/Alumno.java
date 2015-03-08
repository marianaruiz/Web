/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;

import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import model.daos.AlumnoDAO;
/**
 *
 * @author Mariana
 */
@Entity
@Table (name = "Alumno")
public class Alumno implements Serializable{
    @Id
    private String Boleta;
    private String contrasena;
    private String nombre;
    private String paterno;
    private String materno;
    @OneToOne(cascade ={CascadeType.PERSIST, CascadeType.REMOVE})
    private telefono tel;
    @OneToOne(cascade ={CascadeType.PERSIST, CascadeType.REMOVE})
    private Direccion dir;
    @OneToMany(cascade = CascadeType.ALL ,fetch = FetchType.LAZY )
    private List<email> emails =new ArrayList<email>();
    @OneToOne(cascade ={CascadeType.PERSIST, CascadeType.REMOVE})
    private estado estado;
    //@Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    //@Temporal(TemporalType.TIME)
    //private Time fechaHoradeIngreso;
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

    public Direccion getDir() {
        return dir;
    }

    public void setDir(Direccion dir) {
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public telefono getTel() {
        return tel;
    }

    public void setTel(telefono tel) {
        this.tel = tel;
    }

    public estado getEstado() {
        return estado;
    }

    public void setEstado(estado estado) {
        this.estado = estado;
    }
    /*public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        Alumno a= new Alumno();
        a.Boleta="2012630403";
        a.contrasena="123";
        a.nombre="m";
        a.paterno="r";
        a.materno="e";
        Direccion d=new Direccion();
        d.setCalle("uncalle");
        d.setColonia("unacolonia");
        d.setCiudad("ciudad");
        d.setDelegacion("del");
        a.dir=d;
        email email=new email();
        email.setMail("uncorreo@gmail.com");
        List<email> listamail=new ArrayList();
        listamail.add(email);
        //listamail.add(email);
        a.emails=listamail;
        estado es=new estado();
        es.setEstadoDes("activo");
        a.estado=es;
        Date da = Date.valueOf(LocalDate.MIN);
        Time t = Time.valueOf(LocalTime.MIN);
       // a.fechaHoradeIngreso=t; 
        //a.fechaIngreso=da;
        AlumnoDAO adao=new AlumnoDAO();
        adao.create(a);
        a.nombre="mariana";
        adao.update(a);
        System.out.println(adao.loadAll());
        System.out.println(a);
    }   */ 
}