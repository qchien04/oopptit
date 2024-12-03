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
public class quay_phai {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int max=-1;
            int ans=-1;
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                if(a[i]>=max){
                    max=a[i];
                    ans=i+1;
                    if(ans==n) ans=0;
                }
            }
            System.out.println(ans);
            
        }
    }
}
