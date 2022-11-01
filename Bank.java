/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Bank {
    int saldo = 100000;
   public void ambilMoney(int c){
       saldo = saldo - c;
       if(saldo <= saldo){
           System.out.println("saldo Kurang");
       }else
    System.out.println("Saldo saat ini : " + saldo);
            
   }
   public void simpanMoney(int c){
       saldo = saldo + c;
     System.out.println("Saldo saat ini : " + saldo);      
   }
    public void getSaldo(){
    System.out.println("Saldo saat ini : " + saldo);      
   }  
}
