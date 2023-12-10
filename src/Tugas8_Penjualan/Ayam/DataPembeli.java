/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8_Penjualan.Ayam;


/**
 *
 * @author Riki Firmansyah
 */
public class DataPembeli extends PenjualanAyam implements Diskon {
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
    public int hitungDiskon() {
        int hargaAyam = getHargaAyam();
        int totalHarga = hargaAyam * berapaEkor;
        int diskon = (int) (totalHarga * 0.1); // Diskon 10%
        return diskon;
    }

    @Override
    public int hitungTotalHarga() {
        int hargaAyam = getHargaAyam();
        int total = (hargaAyam * berapaEkor) - hitungDiskon();
        return total;
    }
}