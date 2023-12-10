/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB6.Abstract;

/**
 *
 * @author Riki Firmansyah
 */
public class Gaji_reward extends Gaji_abs_reward{
    double menit;
    int waktu;
    double tunj_bonus;
    double anak;

    // Constructor
    public Gaji_reward(double gajiPokok, double tunjAnak, double menit, int waktu, double tunjBonus, double anak) {
        this.gajipokok = gajiPokok;
        this.tunj_bonus = tunjAnak;
        this.menit = menit;
        this.waktu = waktu;
        this.tunj_bonus = tunjBonus;
        this.anak = anak;
    }

    // Implementasi method lembur dari superclass
    @Override
    public double lembur() {
        // Logika perhitungan lembur
        // Misalnya tarif lembur per jam adalah 50% dari gaji pokok
        return (0.5 * gajipokok) * (menit / 60);
    }

    // Implementasi method tunjanganAnak dari superclass
    @Override
    public double tunjanganAnak() {
        // Logika perhitungan tunjangan anak
        // Misalnya tunjangan anak adalah 10% dari gaji pokok per anak
        return anak * (0.1 * gajipokok);
}

}
