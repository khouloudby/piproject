/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.entities;


import java.sql.Date;


/**
 *
 * @author khoul
 */
public class Historique {
    
    private int id;
    private float  imc; 
     private Date date;
    private int  idAdherant ; 

    public Historique(int id, Date date, float imc, int idAdherant) {
        this.id = id;
        this.date = date;
        this.imc = imc;
        this.idAdherant = idAdherant;
    }

    public Historique(float imc, Date date, int idAdherant) {
        this.imc = imc;
        this.date = date;
        this.idAdherant = idAdherant;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public int getIdAdherant() {
        return idAdherant;
    }

    public void setIdAdherant(int idAdherant) {
        this.idAdherant = idAdherant;
    }

    @Override
    public String toString() {
        return "Historique{" + "id=" + id + ", date=" + date + ", imc=" + imc + ", idAdherant=" + idAdherant + '}';
    }

   

    

    
    
    
    
}
