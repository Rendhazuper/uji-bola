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
public class rumus {
    public double r; 
    public double diameter; 
    public double luaspermukaan;
    public double volume; 
    
    public double getjarijari(){
        return r; 
    }
    
   public void setjarijari(double jarijari){
       r = jarijari;
        
}
   public void showDiameter(){
       diameter = r*r;
       System.out.println("Diameternya adalah "+diameter);
   }
   public void showLuasPermukaan(){
       luaspermukaan = 4 * Math.PI *r*r;
       System.out.println("Luas Permukaannya adalah "+luaspermukaan);
   }
   public void showVolume(){
       volume = 4/3 * Math.PI * r *r *r;
       System.out.println("Volumenya adalah "+volume);
   }
 
}
