/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas1_Penjualan.Ayam;

/**
 *
 * @author Riki Firmansyah
 */
public class Main_ayam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ayam aym = new Ayam();
        aym.dataJenisAyam("Bangkok");
        aym.dataHargaAyam(500000);
        aym.dataUmur("4 bulan");
        aym.dataJenisKelamin("Jantan");
        aym.dataPembeli("Riki Firmansyah");
        
        System.out.println("Jenis : " + aym.getJenisAyam());
        System.out.println("Harga : " + aym.getHargaPerEkor());
        System.out.println("Umur : " + aym.getUmur());
        System.out.println("Kelamin : " + aym.getJenisKelamin()); 
        System.out.println("Nama : " + aym.getPembeli());
    }
    
}
