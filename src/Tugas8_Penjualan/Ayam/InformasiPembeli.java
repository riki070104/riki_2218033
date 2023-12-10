/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas8_Penjualan.Ayam;



/**
 *
 * @author Riki Firmansyah
 */
public class InformasiPembeli extends PenjualanAyam implements Diskon {
    //atribut InformasiPembeli
    private String kodeAyam;
    private String tanggalPembelian;
    int biayaPengiriman = 50000;
    int berapaEkor;
    int jarak;
    
    //construktor
    void dataKodeAyam(String Kode){
        this.kodeAyam = Kode;
    }
    
    void dataTanggalPembelian(String Tanggal){
        this.tanggalPembelian = Tanggal;
    }
    
    void dataBiayaPengiriman(int jarak){
        this.biayaPengiriman = jarak;
    }
    
    
    //method
    String getKodeAyam(){
        return kodeAyam;
    }
    
    String getTanggalPembelian(){
        return tanggalPembelian;
    }
    
    int getBiayaPengiriman(){
            return jarak;
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
    
    public int getBiayaPengiriman(int jarak) {
        return biayaPengiriman + (jarak * 1000);
    }
    
    public int hitungDiskon() {
        int hargaAyam = getHargaAyam();
        int totalHarga = (hargaAyam * berapaEkor) + getBiayaPengiriman(jarak);
        int diskon = (int) (totalHarga * 0.05); 
        return diskon;
    }

    @Override
    public int hitungTotalHarga() {
        int hargaAyam = getHargaAyam();
        int total = (hargaAyam * berapaEkor) - hitungDiskon() + getBiayaPengiriman(jarak);
        return total;
    }
}
