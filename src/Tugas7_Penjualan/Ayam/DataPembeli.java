/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas7_Penjualan.Ayam;


/**
 *
 * @author Riki Firmansyah
 */
public class DataPembeli extends PenjualanAyam {
    //atribut dataPembeli
    String kota;
    public String namaPembeli;
    public int berapaEkor;
    private int total;
    
    //Construktor dataPembeli
    void dataNamaPembeli(String Pembeli){
        this.namaPembeli = Pembeli;
    }
    
    void dataKota(String Kota){
        this.kota = Kota;
    }
    
    void dataBerapaEkor(int Ekor){
        this.berapaEkor = Ekor;
    }
    
    String getNamaPembeli(){
        return namaPembeli;
    }
    
    String getKota(){
        return kota;
    }
    
    int getBerapaEkor(){
        return berapaEkor;
    }
    
    
    @Override
    public int getHargaAyam() {
        switch(jenisKelamin){
            case "Jantan":
                return 80000;
            case "Betina":
                return 50000;
            default:
                return 0;
        }
    }
    
    @Override
    public int hitungTotalHarga() {
        return getHargaAyam() * berapaEkor; // Menggunakan atribut langsung
    }
}
