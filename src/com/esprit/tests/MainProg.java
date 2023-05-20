/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.esprit.tests;


import com.esprit.entities.Association;
import com.esprit.entities.Conseil;
import com.esprit.entities.Historique;
import com.esprit.services.ServiceAssociation;
import com.esprit.services.ServiceConseil;
import com.esprit.services.ServiceHistorique;
import java.sql.Date;



/**

/**
 *
 * @author khoul
 */
public class MainProg {

   
    public static void main(String[] args) {
              
   
    
      Date maDate = Date.valueOf("2023-05-15");
        Date maDate1 = Date.valueOf("2023-07-20");
        Historique h = new Historique(1,55.01f,maDate1,2);
        ServiceHistorique sh = new ServiceHistorique();
        sh.ajouter(h );
        
         Date maDate2 = Date.valueOf("2023-05-15");
        Historique h2 = new Historique(2,40.2f,maDate2,1);
        ServiceHistorique sh2 = new ServiceHistorique();
        sh2.ajouter(h2 );
    
         
        Conseil c1 = new Conseil(1,"obeisite",40.2f,70.0f);
        ServiceConseil sc = new ServiceConseil();
        sc.ajouter(c1 );
       
        
        Conseil c2 = new Conseil(2,"obeisite",50.02f,60.0f);
        ServiceConseil sc1 = new ServiceConseil();
        sc1.ajouter(c2 );

//       sc1.supprimer(c2);
//       sc.afficher();
         
        Date maDate3 = Date.valueOf("2024-01-27");
         
          h2.setIdHistorique(3);
          h2.setDate(maDate3);
          h2.setImc(80.02f);
          h2.setIdAdherant(10);
        
          sh2.modifier(h2);
      
          System.out.println (sh2.afficher());
        
   
          Association a1= new Association(1,1);
          
          ServiceAssociation sa=new ServiceAssociation();
          
         sa.ajouter(a1);
         
         
          
          
}
    }
    

