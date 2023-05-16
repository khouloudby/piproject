/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.entities;

/**
 *
 * @author khoul
 */
public class Conseil {
    private int id;
     private String texte;
     private float imcMax ; 
     private float imcMin;

    public Conseil(int id, String texte, float imcMax, float imcMin) {
        this.id = id;
        this.texte = texte;
        this.imcMax = imcMax;
        this.imcMin = imcMin;
    }

    public Conseil(String texte, float imcMax, float imcMin) {
        this.texte = texte;
        this.imcMax = imcMax;
        this.imcMin = imcMin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public float getImcMax() {
        return imcMax;
    }

    public void setImcMax(float imcMax) {
        this.imcMax = imcMax;
    }

    public float getImcMin() {
        return imcMin;
    }

    public void setImcMin(float imcMin) {
        this.imcMin = imcMin;
    }


    @Override
    public String toString() {
        return "Conseil{" + "id=" + id + ", texte=" + texte + ", imcMax=" + imcMax + ", imcMin=" + imcMin + '}';
    }
 
    
    
    
    
}
  
   

   

    