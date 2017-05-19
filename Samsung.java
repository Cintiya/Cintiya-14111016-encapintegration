/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Learning;

/**
 *
 * @author Win 10
 */
public abstract class Samsung {
    protected String baterai = "tanam";
    public String kamera = "20mp";
    
    protected String getBaterai(){
        return baterai;
    }
     public String getKamera(){
        return kamera;
    }
    
    protected abstract void printBaterai();
    public abstract void printKamera();
}
