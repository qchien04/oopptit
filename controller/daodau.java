/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class daodau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        long sum=0;
        int am=0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i:a){
            if(i<0) am++;
        }
        if(am>k){
            for(int i=0;i<k;i++){
                a[i]=-a[i];
            }
        }
        else{
            for(int i=0;i<am;i++){
                a[i]=-a[i];
            }
            Arrays.sort(a);
            if((k-am)%2==1) a[0]=-a[0];
        }
        for(int i:a){
            sum+=i;
        }
        System.out.println(sum);
    }
}
