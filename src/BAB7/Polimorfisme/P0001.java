/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB7.Polimorfisme;

/**
 *
 * @author Riki Firmansyah
 */
public class P0001 extends Pembayaran {
    public String name, alamat;
    public int saldo;
    public String kode;
    double diskon, bayar, total;
    public P0001(){
        this.name = "Sanjaya";
        this.kode = "P0001";
        this.saldo = 3000000;
        this.alamat = "Malang, jl.singosari no 33";
    }
    @Override
    double cekKode(String input){
        if(input.compareTo(kode) == 0){
            diskon = 0.3;
        }else{
            diskon = 0;
        }
        return diskon;
    }
    @Override
    double hitPembayaran(double bayar){
        diskon = bayar * diskon;
        total = bayar - diskon;
        return total;
    }
    double potSaldo(){
        return this.saldo - total;
    }
    @Override
    void tampilkanMember(){
        System.out.println("Member P0001 dengan diskon 30%");
    }
}
