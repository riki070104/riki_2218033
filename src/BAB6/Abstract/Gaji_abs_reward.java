/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6.Abstract;

/**
 *
 * @author Riki Firmansyah
 */
public abstract class Gaji_abs_reward {
    double gajipokok; // Gaji Pokok
    double tunj_anak; // Tunjangan Anak

    // Method abstract yang akan diimplementasikan di subclass
    abstract double lembur(); // Method lembur
    abstract double tunjanganAnak(); // Method tunjanganAnak

}
