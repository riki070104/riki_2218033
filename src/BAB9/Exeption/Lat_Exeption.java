/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB9.Exeption;

/**
 *
 * @author Riki Firmansyah
 */
import javax.swing.JOptionPane;
import java.util.Scanner;
public class Lat_Exeption {
    public static void main(String[] args){
        try{
            int a ,b ,hasil;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("=====Program Pemrograman======");
            System.out.println("Masukkan angka 1 = ");
            a = Integer.parseInt(keyboard.next());
            System.out.println("Masukkan angka ke 2 = ");
            b = Integer.parseInt(keyboard.next());
            hasil = a/b;
            System.out.println("Hasil :" + Integer.toString(hasil));
        }catch(ArithmeticException c){
            JOptionPane.showMessageDialog(null, "Nilai pembagi tidak boleh 0!!", "Warning", 2);
            
        }catch(NumberFormatException d){
            JOptionPane.showMessageDialog(null, "Input yang anda masukkkan huruf bukan angka!!", "Warning", 2);
        }finally{
            System.out.println("Trimakasih sudah menjalankan program8");
        }
    }
}
