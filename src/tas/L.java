/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tas;

import java.awt.Color;

/**
 *
 * @author kadir
 */
public class L extends Sekil{
    
    public L(){
        super.setParca1X(0);  super.setParca1Y(5);
        super.setParca2X(1);  super.setParca2Y(5);
        super.setParca3X(2);  super.setParca3Y(5);
        super.setParca4X(2);  super.setParca4Y(6);
    }
    
    int sayac = 0;
    @Override
    public void dondur() {
        if(sayac == 0){
            super.setParca1X(super.getParca1X() + 2);  super.setParca1Y(super.getParca1Y() - 2);
            super.setParca2X(super.getParca2X() + 1);  super.setParca2Y(super.getParca2Y() - 1);
            super.setParca4X(super.getParca4X() - 1);  super.setParca4Y(super.getParca4Y() - 1);
            
            sayac++;
        }
        
        else if(sayac == 1){
            super.setParca1X(super.getParca1X() + 2);  super.setParca1Y(super.getParca1Y() + 2);
            super.setParca2X(super.getParca2X() + 1);  super.setParca2Y(super.getParca2Y() + 1);
            super.setParca4X(super.getParca4X() + 1);  super.setParca4Y(super.getParca4Y() - 1);
            
            sayac++;
        }
        
        else if(sayac == 2){
            super.setParca1X(super.getParca1X() - 2);  super.setParca1Y(super.getParca1Y() + 2);
            super.setParca2X(super.getParca2X() - 1);  super.setParca2Y(super.getParca2Y() + 1);
            super.setParca4X(super.getParca4X() + 1);  super.setParca4Y(super.getParca4Y() + 1);
            
            sayac++;
        }
        
        else{
            super.setParca1X(super.getParca1X() - 2);  super.setParca1Y(super.getParca1Y() - 2);
            super.setParca2X(super.getParca2X() - 1);  super.setParca2Y(super.getParca2Y() - 1);
            super.setParca4X(super.getParca4X() - 1);  super.setParca4Y(super.getParca4Y() + 1);
            
            sayac = 0;
        }
    }
    
}
