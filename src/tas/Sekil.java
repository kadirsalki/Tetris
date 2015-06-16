/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tas;
import java.awt.Color;
import javax.swing.JLabel;


public abstract class Sekil extends JLabel{
    private int parca1X;
    private int parca2X;
    private int parca3X;
    private int parca4X;
    private int parca1Y;
    private int parca2Y;
    private int parca3Y;
    private int parca4Y;
    
   
    public Color renk;
    
    public Sekil(){
        renk = new Color((int)(Math.random()*250), (int)(Math.random()*250), (int)(Math.random()*250));
    }
    
    public abstract void dondur();
    
    public void hareket(){
        setParca1X(getParca1X() + 1);
        setParca2X(getParca2X() + 1);
        setParca3X(getParca3X() + 1);
        setParca4X(getParca4X() + 1);
    }
    
    public void sagHareket(){
        setParca1Y(getParca1Y() + 1);
        setParca2Y(getParca2Y() + 1);
        setParca3Y(getParca3Y() + 1);
        setParca4Y(getParca4Y() + 1);
    }
    
    public void solHareket(){
        setParca1Y(getParca1Y() - 1);
        setParca2Y(getParca2Y() - 1);
        setParca3Y(getParca3Y() - 1);
        setParca4Y(getParca4Y() - 1);
    }
    
    /**
     * @return the parca1X
     */
    public int getParca1X() {
        return parca1X;
    }

    /**
     * @param parca1X the parca1X to set
     */
    public void setParca1X(int parca1X) {
        this.parca1X = parca1X;
    }

    /**
     * @return the parca2X
     */
    public int getParca2X() {
        return parca2X;
    }

    /**
     * @param parca2X the parca2X to set
     */
    public void setParca2X(int parca2X) {
        this.parca2X = parca2X;
    }

    /**
     * @return the parca3X
     */
    public int getParca3X() {
        return parca3X;
    }

    /**
     * @param parca3X the parca3X to set
     */
    public void setParca3X(int parca3X) {
        this.parca3X = parca3X;
    }

    /**
     * @return the parca4X
     */
    public int getParca4X() {
        return parca4X;
    }

    /**
     * @param parca4X the parca4X to set
     */
    public void setParca4X(int parca4X) {
        this.parca4X = parca4X;
    }

    /**
     * @return the parca1Y
     */
    public int getParca1Y() {
        return parca1Y;
    }

    /**
     * @param parca1Y the parca1Y to set
     */
    public void setParca1Y(int parca1Y) {
        this.parca1Y = parca1Y;
    }

    /**
     * @return the parca2Y
     */
    public int getParca2Y() {
        return parca2Y;
    }

    /**
     * @param parca2Y the parca2Y to set
     */
    public void setParca2Y(int parca2Y) {
        this.parca2Y = parca2Y;
    }

    /**
     * @return the parca3Y
     */
    public int getParca3Y() {
        return parca3Y;
    }

    /**
     * @param parca3Y the parca3Y to set
     */
    public void setParca3Y(int parca3Y) {
        this.parca3Y = parca3Y;
    }

    /**
     * @return the parca4Y
     */
    public int getParca4Y() {
        return parca4Y;
    }

    /**
     * @param parca4Y the parca4Y to set
     */
    public void setParca4Y(int parca4Y) {
        this.parca4Y = parca4Y;
    }
   
}
