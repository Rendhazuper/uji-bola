/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bola;

/**
 *
 * @author GAMES
 */
public class Bola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rumus output = new rumus();
        //manggil jari jari 
        output.setjarijari(5);
        //show diameter
        output.showDiameter();
        //show volume
        output.showVolume();
        //show luaspermukaan
        output.showLuasPermukaan();
        
    }
    
}
