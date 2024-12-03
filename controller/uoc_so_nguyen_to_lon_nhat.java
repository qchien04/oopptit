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
public class uoc_so_nguyen_to_lon_nhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            long num=sc.nextLong();
            long res=0;
            for(long i=2;i<=Math.sqrt(num);i++){
                while(num%i==0){
                    res=Long.max(i, res);
                    num/=i;
                }
            }
            if(num>1) res=Long.max(num, res);
            System.out.println(res);
        }
    }

}
