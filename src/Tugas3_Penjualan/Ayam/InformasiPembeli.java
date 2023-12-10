/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3_Penjualan.Ayam;

/**
 *
 * @author Riki Firmansyah
 */
public class InformasiPembeli extends DataPembeli {
    //atribut InformasiPembeli
    private String kodeAyam;
    private String tanggalPembelian;
    private int biayaPengiriman;
    
    //construktor
    void dataKodeAyam(String Kode){
        this.kodeAyam = Kode;
    }
    
    void dataTanggalPembelian(String Tanggal){
        this.tanggalPembelian = Tanggal;
    }
    
    void dataBiayaPengiriman(int Biaya){
        this.biayaPengiriman = Biaya;
    }
    
    //method
    String getKodeAyam(){
        return kodeAyam;
    }
    
    String getTanggalPembelian(){
        return tanggalPembelian;
    }
    
    int getBiayaPengiriman(){
            return biayaPengiriman;
    }
}
