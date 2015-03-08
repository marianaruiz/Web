/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
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
@Table(name="telefono")
public class telefono implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int idtelefono;
    private String telefonoParticular;
    private String telefonoOficina;
    private String telefonoCelular;
    
    public void telefono(){}

    public telefono(String telefonoParticular, String telefonoOficina, String telefonoCelular) {
        this.telefonoParticular = telefonoParticular;
        this.telefonoOficina = telefonoOficina;
        this.telefonoCelular = telefonoCelular;
    }
    
    
    public int getIdtelefono() {
        return idtelefono;
    }

    public void setIdtelefono(int idtelefono) {
        this.idtelefono = idtelefono;
    }

    public String getTelefonoParticular() {
        return telefonoParticular;
    }

    public void setTelefonoParticular(String telefonoParticular) {
        this.telefonoParticular = telefonoParticular;
    }

    public String getTelefonoOficina() {
        return telefonoOficina;
    }

    public void setTelefonoOficina(String telefonoOficina) {
        this.telefonoOficina = telefonoOficina;
    }

    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    public void setTelefonoCelular(String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }
    
}
