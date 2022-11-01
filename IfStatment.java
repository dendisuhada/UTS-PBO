/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifstatment;

/**
 *
 * @author hp
 */
public class IfStatment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai = 80;
        int absen = 30;
        
        boolean lulusNilai = nilai >= 75;
        boolean lulusAbsen = absen >= 75;
        
        if (nilai >= 75 && absen <= 75 ){
        
        boolean lulus = lulusNilai && lulusAbsen;
        System.out.println("selamat anda lulus");
    }else {
            System.out.println("silahkan Coba Tahun Depan ");
        }
        if (nilai >= 70 && absen >= 80){
            System.out.println("Nilai Anda A");
        }else if (nilai >= 70 && absen >= 70){
            System.out.println("Nilai Anda B");
        }else if (nilai >= 70 && absen >= 60){
            System.out.println("Nilai Anda C");
        }else if (nilai >= 70 && absen >= 50){
            System.out.println("Nilai Anda D");
        }else {
            System.out.println("Nilai Anda E");
        }
        
        
    }
    
}
