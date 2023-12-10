/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas3_Penjualan.Ayam;

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
    
    void dataTotal(int Total){
        this.total = Total;
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
    
    //method dataPembelian
    int getTotalHarga(){
      int total;
      total = getHargaAyam() * getBerapaEkor();
        return total;
    }
}
