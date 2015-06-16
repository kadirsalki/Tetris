/*
 * To change this template, choose Tools | Templatesqq
 * and open the template in the editor.
 */
package test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public final class OyunTest extends javax.swing.JFrame {   
    
    public OyunTest() {
        
        initComponents();
        tetrisPanel = new BenimPanelim();
        this.add(tetrisPanel);
        this.requestFocus();
        basla();
    }
     
    BenimPanelim tetrisPanel ;
   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 601, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
   
        if(evt.getKeyCode() == 40){
            tetrisPanel.temizle();
            tetrisPanel.sekil.hareket();
            kontrol(); 
        }
        
        else if(evt.getKeyCode() == 39 && tetrisPanel.duvarKontrolSag()){
            tetrisPanel.temizle();
            tetrisPanel.sekil.sagHareket();
            kontrol();
        }
        
        else if(evt.getKeyCode() == 37 && tetrisPanel.duvarKontrolSol()){
            tetrisPanel.temizle();
            tetrisPanel.sekil.solHareket();
            kontrol();
        }
        
        else if(evt.getKeyCode() == 38 && tetrisPanel.duvarKontrolSol() && tetrisPanel.duvarKontrolSag()){
            tetrisPanel.temizle();
            tetrisPanel.sekil.dondur();
            kontrol();
        }
        
    }//GEN-LAST:event_formKeyPressed

    public void kontrol(){
        tetrisPanel.konumAta();
            if(tetrisPanel.hareketKontrol()){
                 t.stop();
                 tetrisPanel.konumAta();
                 tetrisPanel.konumAta2();
                 tetrisPanel.patlat();
                 if(tetrisPanel.oyunBittiMi())
                  {
                      yeniOyun();
                  }
                 tetrisPanel.sekil =tetrisPanel.sekilUretici();
                 t.start();
                 
            }
            
    }
    
    javax.swing.Timer  t ;
     public void basla(){
      t= new javax.swing.Timer(600, new ActionListener(){
          @Override
            public void actionPerformed(ActionEvent e) 
            {  
                tetrisPanel.temizle();
                tetrisPanel.sekil.hareket();
                kontrol();
                tetrisPanel.konumAta();
            }
        
        }); t.start();
      }
  
   public void yeniOyun(){
        int sonuc;
        t.stop();
        sonuc = JOptionPane.showConfirmDialog(rootPane,"Yeniden oynamak ister misiniz", "Oyun Bitti!!", 2);
        if(sonuc == 0){
            for(int i=0 ;i<tetrisPanel.tetrisDizisi.length ;i++) {
              for(int j=0 ;j<tetrisPanel.tetrisDizisi[i].length ;j++) {
                    tetrisPanel.tetrisDizisi[i][j].setBackground(Color.white);
                }
          }
        
        tetrisPanel.sekil = tetrisPanel.sekilUretici();
        t.start();
        }
        else{
            t.stop();
            this.dispose();
        }
          
          
   } 
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OyunTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OyunTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OyunTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OyunTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OyunTest().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
