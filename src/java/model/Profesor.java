/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.io.Serializable;
import java.util.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Mariana
 */
@Entity
@Table(name = "Profesor")
public class Profesor implements  Serializable{
    @Id
    private String RFC;
    private String contrasena;
    private String nombre;
    private String paterno;
    private String materno;
    @OneToOne(cascade ={CascadeType.PERSIST, CascadeType.REMOVE})
    private Direcion dir;
    @OneToOne(cascade ={CascadeType.PERSIST, CascadeType.REMOVE})
    private telefono tel;
    @OneToOne(cascade ={CascadeType.PERSIST, CascadeType.REMOVE})
    private estado estado;
    @OneToMany(cascade = CascadeType.ALL ,fetch = FetchType.LAZY )
    private List<email> emails =new ArrayList<email>();
    
    @Temporal(TemporalType.DATE)
    private Date fechaIngreso;
    private Time fechaHoradeIngreso;
    
    public Profesor() {
    }
    
    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
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

    public telefono getTel() {
        return tel;
    }

    public void setTel(telefono tel) {
        this.tel = tel;
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

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public estado getEstado() {
        return estado;
    }

    public void setEstado(estado estado) {
        this.estado = estado;
    }
    
}
