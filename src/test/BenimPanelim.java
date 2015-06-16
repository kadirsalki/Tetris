/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import tas.Sekil;
import tas.Cubuk;
import tas.Kare;
import tas.L;
import tas.T;
import tas.Z;

public final class BenimPanelim extends JPanel{
     
     private final int satir = 20;
     private final int sutun = 20;
     JLabel tetrisDizisi[][] = new JLabel[satir][sutun];
     Sekil sekil = new L();
     
     public BenimPanelim(){
         this.setSize(600, 600);
         this.setVisible(true);
         this.setOpaque(true);
         baslangic();
         sekil = sekilUretici();
         konumAta();
     }

     public Sekil sekilUretici(){
        Sekil sekil;
        int i = (int)( Math.random()*5 +1 );
        
        if(i==1){
            sekil = new Cubuk();
        }
         
        else if(i==2){
            sekil = new Z();
        }
         
        else if(i==3){
            sekil = new L();
        }
         
        else if(i==4){
            sekil = new Kare();
        }
        else {
            sekil= new T();
        }
        
        
        return sekil;
        
    }
     
     public void konumAta(){
         tetrisDizisi[sekil.getParca1X()][sekil.getParca1Y()].setBackground(sekil.renk);
         tetrisDizisi[sekil.getParca2X()][sekil.getParca2Y()].setBackground(sekil.renk);
         tetrisDizisi[sekil.getParca3X()][sekil.getParca3Y()].setBackground(sekil.renk);
         tetrisDizisi[sekil.getParca4X()][sekil.getParca4Y()].setBackground(sekil.renk);      
     }
     public void konumAta2(){
         tetrisDizisi[sekil.getParca1X()][sekil.getParca1Y()].setBackground(Color.darkGray);
         tetrisDizisi[sekil.getParca2X()][sekil.getParca2Y()].setBackground(Color.darkGray);
         tetrisDizisi[sekil.getParca3X()][sekil.getParca3Y()].setBackground(Color.darkGray);
         tetrisDizisi[sekil.getParca4X()][sekil.getParca4Y()].setBackground(Color.darkGray);  
     }
     
     public void temizle(){
          tetrisDizisi[sekil.getParca1X()][sekil.getParca1Y()].setBackground(Color.white);
          tetrisDizisi[sekil.getParca2X()][sekil.getParca2Y()].setBackground(Color.white);
          tetrisDizisi[sekil.getParca3X()][sekil.getParca3Y()].setBackground(Color.white);
          tetrisDizisi[sekil.getParca4X()][sekil.getParca4Y()].setBackground(Color.white);
     }
     
     public void baslangic(){
         setLayout(new GridLayout(satir,sutun,1,1));
         for(int i=0 ;i<satir ; i++)
         {
            for(int j=0; j<sutun;j++)
             {
                 tetrisDizisi[i][j]=new JLabel();
                 tetrisDizisi[i][j].setOpaque(true);
                 tetrisDizisi[i][j].setBackground(Color.white);
                 add(tetrisDizisi[i][j]);
             }
                    
        }
    }
     
     public boolean duvarKontrolSag(){
         if( sekil.getParca1Y() == sutun-1 || sekil.getParca2Y() == sutun-1 || sekil.getParca3Y() == sutun-1 || sekil.getParca4Y() == sutun-1 ||
             tetrisDizisi[sekil.getParca1X()][sekil.getParca1Y()+1].getBackground()!=Color.white && tetrisDizisi[sekil.getParca1X()][sekil.getParca1Y()+1].getBackground()!=tetrisDizisi[sekil.getParca1X()][sekil.getParca1Y()].getBackground() ||
             tetrisDizisi[sekil.getParca2X()][sekil.getParca2Y()+1].getBackground()!=Color.white && tetrisDizisi[sekil.getParca2X()][sekil.getParca2Y()+1].getBackground()!=tetrisDizisi[sekil.getParca2X()][sekil.getParca2Y()].getBackground() ||
             tetrisDizisi[sekil.getParca3X()][sekil.getParca3Y()+1].getBackground()!=Color.white && tetrisDizisi[sekil.getParca3X()][sekil.getParca3Y()+1].getBackground()!=tetrisDizisi[sekil.getParca3X()][sekil.getParca3Y()].getBackground() ||
             tetrisDizisi[sekil.getParca4X()][sekil.getParca4Y()+1].getBackground()!=Color.white && tetrisDizisi[sekil.getParca4X()][sekil.getParca4Y()+1].getBackground()!=tetrisDizisi[sekil.getParca4X()][sekil.getParca4Y()].getBackground() ) {
             return false;
         }
         else {
             return true;
         }
     }
     
     public boolean hareketKontrol(){
         if( sekil.getParca1X() == satir-1 || sekil.getParca2X() == satir-1 || sekil.getParca3X() == satir-1 || sekil.getParca4X() == satir-1 ) {
             return true;
         }
         else if(renkKontrol()) {
             return true;
         }
         else {
             return false;
         }
     }
     
     public boolean duvarKontrolSol(){
         if( sekil.getParca1Y() == 0 || sekil.getParca2Y() == 0 || sekil.getParca3Y() == 0 || sekil.getParca4Y() == 0 ||
             tetrisDizisi[sekil.getParca1X()][sekil.getParca1Y()-1].getBackground()!=Color.white && tetrisDizisi[sekil.getParca1X()][sekil.getParca1Y()-1].getBackground()!=tetrisDizisi[sekil.getParca1X()][sekil.getParca1Y()].getBackground() ||
             tetrisDizisi[sekil.getParca2X()][sekil.getParca2Y()-1].getBackground()!=Color.white && tetrisDizisi[sekil.getParca2X()][sekil.getParca2Y()-1].getBackground()!=tetrisDizisi[sekil.getParca2X()][sekil.getParca2Y()].getBackground() ||
             tetrisDizisi[sekil.getParca3X()][sekil.getParca3Y()-1].getBackground()!=Color.white && tetrisDizisi[sekil.getParca3X()][sekil.getParca3Y()-1].getBackground()!=tetrisDizisi[sekil.getParca3X()][sekil.getParca3Y()].getBackground() ||
             tetrisDizisi[sekil.getParca4X()][sekil.getParca4Y()-1].getBackground()!=Color.white && tetrisDizisi[sekil.getParca4X()][sekil.getParca4Y()-1].getBackground()!=tetrisDizisi[sekil.getParca4X()][sekil.getParca4Y()].getBackground() ) {
             return false;
         }
         else {
             return true;
         }
     }
     
     public boolean renkKontrol(){
         if( tetrisDizisi[sekil.getParca1X()+1][sekil.getParca1Y()].getBackground()!=Color.white && tetrisDizisi[sekil.getParca1X()+1][sekil.getParca1Y()].getBackground()!=tetrisDizisi[sekil.getParca1X()][sekil.getParca1Y()].getBackground() ||
             tetrisDizisi[sekil.getParca2X()+1][sekil.getParca2Y()].getBackground()!=Color.white && tetrisDizisi[sekil.getParca2X()+1][sekil.getParca2Y()].getBackground()!=tetrisDizisi[sekil.getParca2X()][sekil.getParca2Y()].getBackground() ||
             tetrisDizisi[sekil.getParca3X()+1][sekil.getParca3Y()].getBackground()!=Color.white && tetrisDizisi[sekil.getParca3X()+1][sekil.getParca3Y()].getBackground()!=tetrisDizisi[sekil.getParca3X()][sekil.getParca3Y()].getBackground() ||
             tetrisDizisi[sekil.getParca4X()+1][sekil.getParca4Y()].getBackground()!=Color.white && tetrisDizisi[sekil.getParca4X()+1][sekil.getParca4Y()].getBackground()!=tetrisDizisi[sekil.getParca4X()][sekil.getParca4Y()].getBackground() ) {
             return true;
         }
         else {
             return false;
         }
     }
     
     public boolean patlamaKontrol(int indis){
         
             for(int j=tetrisDizisi[indis].length - 1; j>=0; j--){
                 
                 if(tetrisDizisi[indis][j].getBackground() != Color.darkGray)
                     return false;
                 
             }
             return true;
     }
     
     public void kaydir(int gelenIndis){
         for(int i=gelenIndis; i>0; i--){
             for(int j=0; j<tetrisDizisi[i].length; j++){
                 tetrisDizisi[i][j].setBackground(tetrisDizisi[i-1][j].getBackground());   
             }
         }
         patlat();
     }
     
     public void patlat(){
         for(int i=tetrisDizisi.length - 1; i>=0; i--){
             if(patlamaKontrol(i)){
                 for(int j=0; j<tetrisDizisi[i].length; j++){
                     tetrisDizisi[i][j].setBackground(Color.white);
                 }
                 kaydir(i);
             }
         }
     }
     
     public boolean oyunBittiMi(){
         
         for(int i=0;i<tetrisDizisi[0].length-1 ;i++) {
             if(tetrisDizisi[1][i].getBackground() != Color.white)
                 return true;
         }
         return false;
     }
}
