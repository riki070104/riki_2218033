/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab2.ClassObject;

/**
 *
 * @author Riki Firmansyah
 */
public class Luas_Segitiga {
    int alas, tinggi;
    double luas;

    public Luas_Segitiga() {
        this.alas = 10;
    }
    
    public double Luas(){
        luas = (alas*tinggi)/2;
        return luas;
    }
    
    
}
