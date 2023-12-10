/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6.Abstract;

/**
 *
 * @author Riki Firmansyah
 */
public abstract class Kendaraan {
    String merk;
    int tahun;
    String warna;
    
    public Kendaraan(String merk, int tahunProduksi, String warna) {
        this.merk = merk;
        this.tahun = tahunProduksi;
        this.warna = warna;
    }
    
    @Override
    public String toString() {
        return "Merk: " + merk + ", Tahun Produksi: " + tahun + ", Warna: " + warna;
    }
}
