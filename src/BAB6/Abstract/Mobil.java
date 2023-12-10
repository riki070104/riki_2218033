/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6.Abstract;

/**
 *
 * @author Riki Firmansyah
 */
public class Mobil extends Kendaraan {
    String jenisMobil;
    int kapasitas;
    
    public Mobil(String merk, int tahunProduksi, String warna, String jenisMobil, int kapasitasPenumpang) {
        super(merk, tahunProduksi, warna);
        this.jenisMobil = jenisMobil;
        this.kapasitas = kapasitasPenumpang;
    }
    
    @Override
    public String toString() {
        return super.toString() + ", Jenis Mobil: \n" + jenisMobil + ", Kapasitas Penumpang: " + kapasitas;
    }
}
