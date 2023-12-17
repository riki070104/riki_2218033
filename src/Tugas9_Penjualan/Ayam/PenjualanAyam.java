/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas9_Penjualan.Ayam;



/**
 *
 * @author Riki Firmansyah
 */
public abstract class PenjualanAyam {
    public String namaPenjual;
    public String jenisAyam;
    int umur;
    String jenisKelamin;
    private int hargaPerEkor;
    
    void dataNamaPenjual(String NamaPenjual){
        this.namaPenjual = NamaPenjual;
    }
    
    void dataJenisAyam(String jenisAyam){
        this.jenisAyam = jenisAyam;
    }
    
    void dataUmur(int Umur){
        this.umur = Umur;
    }
    
    void dataJenisKelamin(String JenisKelamin){
        this.jenisKelamin = JenisKelamin;
    }
    
    public String getPenjual(){
        return namaPenjual;
    }
     
    public String getJenisAyam(){
        return jenisAyam;
    }
     
    public int getUmur() {
        return umur;
    }
    
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    public abstract int hitungTotalHarga();
    public abstract int getHargaAyam();
}