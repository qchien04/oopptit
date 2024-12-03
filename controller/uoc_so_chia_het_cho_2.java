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
public class uoc_so_chia_het_cho_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int num=sc.nextInt();
            int count=0;
            for(int i=2;i<=Math.sqrt(num);i++){
                if(num%i==0){
                    if(i%2==0) count++;
                    if((num/i)%2==0&&(i!=num/i)){
                        count++;
                    }
                }
            }
            if(num%2==0) count++;
            System.out.println(count);
        }
    }
}
