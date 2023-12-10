/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1_Penjualan.Ayam;

/**
 *
 * @author Riki Firmansyah
 */
public class Ayam {
    String namaPembeli,jenisAyam,umur,jenisKelamin;
    int hargaPerEkor;
   // konstruktor tanpa diberi nilai parameter
    public Ayam(){
        jenisAyam = "Bangkok";
        umur = "4 Bln";
        jenisKelamin = "Jantan";
        hargaPerEkor = 500000;
        namaPembeli = "Riki Firmansyah";
    }
    
    // kontruktor diberi nilai parameter
    void dataJenisAyam(String jenisAyam){
        this.jenisAyam = jenisAyam;
    }
    void dataHargaAyam(int hargaPerEkor){
        this.hargaPerEkor = 50000;
    }
    void dataUmur(String umur){
        this.umur = umur;
    }
    void dataJenisKelamin(String jenisKelamin){
        this.jenisKelamin = jenisKelamin;
    }
    void dataPembeli(String Pembeli){
        this.namaPembeli = namaPembeli;
    }
    String getJenisAyam() {
        return jenisAyam;
    }
    int getHargaPerEkor() {
        return hargaPerEkor;
    }

    public String getUmur() {
        return umur;
    }
    
    public String getJenisKelamin() {
        return jenisKelamin;
    }
    
    public String getPembeli(){
        return namaPembeli;
    }
}
