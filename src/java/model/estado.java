/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Mariana
 */
@Entity
@Table(name = "estado")
public class estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int idestado;
    private String estadoDes;

    public estado() {
    }
    public int getIdestado() {
        return idestado;
    }

    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }

    public String getEstadoDes() {
        return estadoDes;
    }

    public void setEstadoDes(String estadoDes) {
        this.estadoDes = estadoDes;
    }
    
}
