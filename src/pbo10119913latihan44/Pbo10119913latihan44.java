/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119913latihan44;

/**
 *
 @author Muhammad Alvin Rizqi Ramadhan
 * Kelas : IF10-K
 * NIM :10119913 
 */
public class Pbo10119913latihan44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baterai energy = new Baterai(3,12);


        System.out.println("Kuat Arus\t\t: "+energy.getKuatArus());
        System.out.println("Hambatan\t\t: "+energy.getHambatan());
        System.out.println("Hasil Tegangan\t: "+energy.hitunTegangan());

    }
    
}
