/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.services;

import com.esprit.entities.Association;
import com.esprit.utils.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khoul
 */

    
        
    public class ServiceAssociation implements IService<Association > {
        
    private Connection cnx = DataSource.getInstance().getCnx();
        
   
      
    @Override
    public void ajouter(Association a) {
        try {
            String req = "insert into Association(idAdherant,idHistorique) VALUES (?,?);";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1,a.getIdAdherant());
            pst.setInt(2,a.getIdHistorique());
            pst.executeUpdate();
            System.out.println("Association ajoutée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }

    
           
        @Override
     public void modifier(Association a) {
        try {
            String req = "UPDATE Association SET idAdherant=?, idHistorique=?WHERE idAssociation=?";
            PreparedStatement pst = cnx.prepareStatement(req);
             pst.setInt(1, a.getIdAdherant());
            pst.setInt(2, a.getIdHistorique());
            pst.executeUpdate();
            System.out.println("Association modifiée!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
     
     
    @Override
        public void supprimer(Association a) {
   
        try {
            String req = "DELETE from Association WHERE idAssociation=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.executeUpdate();
            System.out.println("association supprimée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

     @Override
     public List<Association> afficher() {
       
        List<Association> list = new ArrayList<>();
        
        String req = "SELECT * FROM Association";
        try {
            PreparedStatement pst = cnx.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                list.add(new Association(rs.getInt("idAdherant"),rs.getInt("idHistorique")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
      
     return list ; 
    }
     
     
     
     
     
        
    }
     
     
     
    
