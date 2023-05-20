/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.entities;

/**
 *
 * @author khoul
 */
public class Association {
       
    private int  idAdherant;
    private int idHistorique;

   
    public Association(int idAdherant, int idHistorique) {
        this.idAdherant = idAdherant;
        this.idHistorique = idHistorique;
    }

   

    public int getIdAdherant() {
        return idAdherant;
    }

    public void setIdAdherant(int idAdherant) {
        this.idAdherant = idAdherant;
    }

    public int getIdHistorique() {
        return idHistorique;
    }

    public void setIdHistorique(int idHistorique) {
        this.idHistorique = idHistorique;
    }

    @Override
    public String toString() {
        return "Association{" + "idAdherant=" + idAdherant + ", idHistorique=" + idHistorique + '}';
    }

    
    
    
     
     
     
     
     
     
}
