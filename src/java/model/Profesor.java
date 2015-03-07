/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Mariana
 */
@Entity
@Table(name = "Profesor")
public class Profesor {
    @Id
    private String RFC;
    private String nombre;
    private String paterno;
    private String materno;
    @OneToOne(cascade ={CascadeType.PERSIST, CascadeType.REMOVE})
    private Direcion dir;

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
    
}
