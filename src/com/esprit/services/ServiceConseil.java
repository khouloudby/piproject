/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.services;

import com.esprit.entities.Conseil;
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

    
    public class ServiceConseil implements IServicE<Conseil> {
        
        
        private Connection cnx = DataSource.getInstance().getCnx();
        
   
    public void ajouter(Conseil c ) {
        try {
            String req = "INSERT INTO Conseil (texte,imcMax,imcMin) VALUES (?,?,?);";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setString (1,c.getTexte());
            pst.setFloat(2, c.getImcMax());
            pst.setFloat(3,c.getImcMin());
            pst.executeUpdate();
            System.out.println("Conseil  ajouté !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());  
        }
    }

    @Override
    
        
     public void modifier(Conseil c) {
        try {
            String req = "UPDATE Conseil  SET texte=?, imcMax=?,imcMin=? WHERE id=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setString(3, c.getTexte());
            pst.setFloat(1,  c.getImcMax());
            pst.setFloat(2, c.getImcMin());
            pst.executeUpdate();
            System.out.println("Conseil  modifié!");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    

    @Override
    public void supprimer(Conseil c) {
   
        try {
            String req = "DELETE from Conseil WHERE id=?";
            PreparedStatement pst = cnx.prepareStatement(req);
            pst.setInt(1, c.getId());
            pst.executeUpdate();
            System.out.println("Conseil  supprimée !");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    

    public List<Conseil > afficher() {
       
        List<Conseil > list = new ArrayList<>();
        
        String req = "SELECT * FROM Conseil ";
        try {
            PreparedStatement pst = cnx.prepareStatement(req);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                list.add(new Conseil (rs.getInt("id"),rs.getString("texte"),rs.getFloat("imcMax"),rs.getFloat("imcMin")));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
      
        return list;   
    }

    }
    
        

        
        



