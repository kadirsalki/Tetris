/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tas;

/**
 *
 * @author Bugrahan
 */
public class T extends Sekil{

    public T(){
        super.setParca1X(0);  super.setParca1Y(4);
        super.setParca2X(0);  super.setParca2Y(5);
        super.setParca3X(0);  super.setParca3Y(6);
        super.setParca4X(1);  super.setParca4Y(5);
    }
    
    int sayac = 0;
    @Override
    public void dondur() {
        if(sayac == 0){
            super.setParca1X(super.getParca1X() + 1);  super.setParca1Y(super.getParca1Y() + 1);
            super.setParca3X(super.getParca3X() - 1);  super.setParca3Y(super.getParca3Y() - 1);
            super.setParca4X(super.getParca4X() - 1);  super.setParca4Y(super.getParca4Y() + 1);
            
            sayac++;
        }
        
        else if(sayac == 1){
            super.setParca1X(super.getParca1X() - 1);  super.setParca1Y(super.getParca1Y() + 1);
            super.setParca3X(super.getParca3X() + 1);  super.setParca3Y(super.getParca3Y() - 1);
            super.setParca4X(super.getParca4X() - 1);  super.setParca4Y(super.getParca4Y() - 1);
            
            sayac++;
        }
        
        else if(sayac == 2){
            super.setParca1X(super.getParca1X() - 1);  super.setParca1Y(super.getParca1Y() - 1);
            super.setParca3X(super.getParca3X() + 1);  super.setParca3Y(super.getParca3Y() + 1);
            super.setParca4X(super.getParca4X() + 1);  super.setParca4Y(super.getParca4Y() - 1);
            
            sayac++;
        }
        
        else{
            super.setParca1X(super.getParca1X() + 1);  super.setParca1Y(super.getParca1Y() - 1);
            super.setParca3X(super.getParca3X() - 1);  super.setParca3Y(super.getParca3Y() + 1);
            super.setParca4X(super.getParca4X() + 1);  super.setParca4Y(super.getParca4Y() + 1);
            
            sayac = 0;
        }
    }
    
}
