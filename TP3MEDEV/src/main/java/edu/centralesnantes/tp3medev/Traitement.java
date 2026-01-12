/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.centralesnantes.tp3medev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author vadimdigonnet
 */
public class Traitement {
    public void lecture(String nomFichier) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;
            while((ligne = reader.readLine()) != null){
                
            }
            
            
        }catch (IOException e){
           System.err.println("Erreur de chargement : " + e.getMessage());
       }
    }
}
