/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProjectPraktikum.Bab1;

/**
 *
 * @author Riki Firmansyah
 */
public class CLI_CetakKTM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa(); 
        mhs.dataNIM("2218033");
        mhs.dataNama("Riki Firmansyah");
        mhs.dataJenisKelamin("Laki-laki ");
        mhs.dataProdi("Teknik Informatika");
        mhs.dataAngkatan("2022");
        mhs.dataAlamat("Malang");
        System.out.println("Kartu Tanda Mahasiswa ITN Malang");
        System.out.println("------------------------------------");
        System.out.println("NIM : "+ mhs.cetakNIM()); 
        System.out.println("Nama : "+ mhs.cetakNama()); 
        System.out.println("Jenis Kelamin : "+ 
        mhs.cetakJenisKelamin()); 
        System.out.println("Prodi : "+ mhs.cetakProdi()); 
        System.out.println("Angkatan : "+ mhs.cetakAngkatan()); 
        System.out.println("Alamat : "+ mhs.cetakAlamat()); 
 
    }
    
}
