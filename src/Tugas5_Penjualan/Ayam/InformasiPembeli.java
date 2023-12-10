/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5_Penjualan.Ayam;

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
    
    void dataBiayaPengiriman(int jarak){
        this.biayaPengiriman = 50000;
    }
    
    
    //method
    String getKodeAyam(){
        return kodeAyam;
    }
    
    String getTanggalPembelian(){
        return tanggalPembelian;
    }
    
    int getBiayaPengiriman(){
            return 50000;
    }
    
    @Override
    public int getHargaAyam() {
        return super.getHargaAyam();
    }
    
    public int getBiayaPengiriman(int jarak) {
        return biayaPengiriman + (jarak * 1000);
    }
    
    public int getTotalHarga(int jarak) {
        return (super.getHargaAyam() * berapaEkor) + getBiayaPengiriman(jarak);
    }
}
