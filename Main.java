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
public class Main {
    public static void main (String []args){
        
        Handphone hp = new Handphone();
        System.out.println("Spesifikasi Handphone ");
        
        
        SamsungS8 ss = new SamsungS8();
        ss.samsung();
        ss.samsungS8();
        ss.printBaterai();
        ss.printKamera();
        
        System.out.println("");
        Asus as = new Asus();
        as.Asus();
    }
    
}
