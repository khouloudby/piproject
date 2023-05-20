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
    
    private int idHistorique;
    private float  imc; 
    private Date date;
    private int  idAdherant ; 

    public Historique(int idHistorique, float imc, Date date, int idAdherant) {
        this.idHistorique = idHistorique;
        this.imc = imc;
        this.date = date;
        this.idAdherant = idAdherant;
    }

    public Historique(float imc, Date date, int idAdherant) {
        this.imc = imc;
        this.date = date;
        this.idAdherant = idAdherant;
    }

    public int getIdHistorique() {
        return idHistorique;
    }

    public void setIdHistorique(int idHistorique) {
        this.idHistorique = idHistorique;
    }

    public float getImc() {
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getIdAdherant() {
        return idAdherant;
    }

    public void setIdAdherant(int idAdherant) {
        this.idAdherant = idAdherant;
    }

    @Override
    public String toString() {
        return "Historique{" + "idHistorique=" + idHistorique + ", imc=" + imc + ", date=" + date + ", idAdherant=" + idAdherant + '}';
    }


}
  

    
   
    
    

