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
public class SamsungS8 extends Samsung {
    
    public void samsung(){
        System.out.println("Handphone Samsung");
        Handphone hp = new Handphone();
        hp.setMerk("Samsung S8");
        System.out.println("Merk Handphone :"+hp.getMerk());
        hp.setWarna("Hitam");
        System.out.println("Warna Handphone:"+hp.getWarna());
        hp.setHarga(12000000);
        System.out.println("Harga Handphone:"+hp.getHarga());
        
       
    }
    
    public void samsungS8(){
        
      System.out.println("Istimewa Samsung S8");
}
    @Override
    protected void printBaterai(){
        System.out.println("Baterai Handphone :"+super.getBaterai());
    }
    
    @Override
    public void printKamera(){
        System.out.println("Kamera Handphone :"+super.getKamera());
    }
}
