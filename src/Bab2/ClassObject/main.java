/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bab2.ClassObject;

/**
 *
 * @author Riki Firmansyah
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kendaraan mobil = new Kendaraan();
        System.out.println("Nama Kendaraan : "+ mobil.nama);
        System.out.println("Warna Kendaraan : "+ mobil.warna);
        System.out.println("Pabrikan Kendaraan : " + mobil.pabrikan);
        System.out.println("Kecepatan minimal : " + mobil.speed + "km/jam \n");
        System.out.println("cara kendaraan bergerak : ");
        System.out.println("Saat maju : ");
        mobil.kendraanMaju();
        System.out.println("Saat mundur : ");
        mobil.kendaraanMundur();
        System.out.println("Saat Berhenti : ");
        mobil.kendaraanBerhenti();
        
        
    }
    
}
