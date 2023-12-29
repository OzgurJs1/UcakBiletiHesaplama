/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package planeticket;

import java.util.Scanner;

/**
 *
 * @author ozzgu
 */
public class PlaneTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int km;
        int yas;
        int tip;
        
        System.out.print("Mesafe giriniz: ");
        km = scan.nextInt();
        
        System.out.print("\nYas giriniz: ");
        yas = scan.nextInt();
        
        System.out.println("\nYolculuk tipini giriniz (1 => Tek Yon, 2 => Gidis Donus)");
        tip = scan.nextInt();
        
       double normalFiyat, yasIndirimi, tipIndirimi;
        
        
        if (km > 0 && yas > 0 && (tip == 1 || tip == 2)) {
            normalFiyat = km * 0.10;
            if (yas < 12) {
                yasIndirimi = normalFiyat * 0.5;
            }
            else if(yas >= 12 && yas <= 24 ){
                yasIndirimi = normalFiyat * 0.1;
                normalFiyat = normalFiyat - yasIndirimi;
            }
            else if(yas >= 65){
                yasIndirimi = normalFiyat * 0.3;
                normalFiyat = normalFiyat - yasIndirimi;
            }
            else{
                yasIndirimi = 0;
            }
            normalFiyat -= yasIndirimi;
            if (tip==2) {
                tipIndirimi = normalFiyat * 0.2;
                normalFiyat = (normalFiyat - tipIndirimi) * 2;
            }
            System.out.println("Bilet tutari = " + normalFiyat + "$");
        }else{
            System.out.println("Girdileri düzgün giriniz.");
        }
    }
    
}
