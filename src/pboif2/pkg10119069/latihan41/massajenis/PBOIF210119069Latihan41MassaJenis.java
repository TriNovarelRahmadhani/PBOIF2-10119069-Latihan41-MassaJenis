/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119069.latihan41.massajenis;

/**
 *
 * @author 
 * NAMA     : TRI NOVAREL RAHMADHANI
 * KELAS    : PBOIF2
 * NIM      : 10119069
 * Deskripsi Program    : program ini berisi program massa jenis
 */
public class PBOIF210119069Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kubus = new Kubus();
        
        System.out.println("=====Massa Jenis Kubus=====");
        kubus.setSisi(5);
        System.out.println("Sisi : " + kubus.getSisi());
        //int sisi = scanner.nextInt();
        //kubus.setSisi(Sisi);
        kubus.setMassa(250);
        System.out.println("Massa : " + kubus.getMassa());
        //int massa = scanner.nextInt;
        //kubus.setMassa(massa);
        
        System.out.println();
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("Volume : " + kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis : " + kubus.hitungMassaJenis(kubus.getMassa(),kubus.hitungVolume(kubus.getSisi())));
    }
    
}
