/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Scanner;


/**
 *
 * @author chien
 */
public class boi_so_nho_nhat_cua_n_so_nguyen_duong_dau_tien {
    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int t;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t-- >0){
            long num=sc.nextLong();
            long ans=1;
            for(long i=2;i<=num;i++){
                ans=(ans*i)/gcd(ans,i);
            }
            System.out.println(ans);
        }
        
    }
}
