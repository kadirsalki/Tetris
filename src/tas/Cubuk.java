/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tas;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Cubuk extends Sekil{
    
    public Cubuk()
    {   
        super.setParca1X(0);  super.setParca1Y(5);
        super.setParca2X(1);  super.setParca2Y(5);
        super.setParca3X(2);  super.setParca3Y(5);
        super.setParca4X(3);  super.setParca4Y(5);
    }
    
    int sayac = 0;
    @Override
    public void dondur() {
        if(sayac == 0){
            super.setParca1X(super.getParca1X() + 1);  super.setParca1Y(super.getParca1Y() - 1);
            super.setParca3X(super.getParca3X() - 1);  super.setParca3Y(super.getParca3Y() + 1);
            super.setParca4X(super.getParca4X() - 2);  super.setParca4Y(super.getParca4Y() + 2);
            
            sayac++;
        }
        
        else{
            super.setParca1X(super.getParca1X() - 1);  super.setParca1Y(super.getParca1Y() + 1);
            super.setParca3X(super.getParca3X() + 1);  super.setParca3Y(super.getParca3Y() - 1);
            super.setParca4X(super.getParca4X() + 2);  super.setParca4Y(super.getParca4Y() - 2);
            
            sayac = 0;
        }
    }
    
}
