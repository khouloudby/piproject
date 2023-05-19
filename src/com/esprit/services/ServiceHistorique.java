/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.services;

import com.esprit.entities.Historique;
import com.esprit.utils.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author khoul
 */
    
    public class ServiceHistorique implements IService<Historique> {
        
        private Connection cnx = DataSource.getInstance().getCnx();
        
   
      
    public void ajouter(Historique h) {
        try {
            String req = "insert into Historique (imc,date,idAdherant) VALUES (?,?,?);";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setFloat(1,h.getImc());
            pst.setDate(2, h.getDate());
            pst.setInt(3,h.getIdAdherant());
            pst.executeUpdate();
            System.out.println("Historique ajouté !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }

  
    
        
     public void modifier(Historique h) {
        try {
            String req = "UPDATE Historique SET imc=?, date=?,idAdherant=? WHERE id=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(4, h.getId());
            pst.setFloat(1, h.getImc());
            pst.setDate(2,  h.getDate());
            pst.setInt(3, h.getIdAdherant());
           
            pst.executeUpdate();
            System.out.println("historique modifié!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    


    public void supprimer(Historique h) {
   
        try {
            String req = "DELETE from Historique WHERE id=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, h.getId());
            pst.executeUpdate();
            System.out.println("historique supprimée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    

 
    public List<Historique> afficher() {
       
        List<Historique> list = new ArrayList<>();
        
        String req = "SELECT * FROM Historique";
        try {
            PreparedStatement pst = cnx.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                list.add(new Historique(rs.getInt("id"),rs.getDate("date"),rs.getFloat("imc"),rs.getInt("idadherant")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
      
        return list;   
    }

    }
    
        

        
        

