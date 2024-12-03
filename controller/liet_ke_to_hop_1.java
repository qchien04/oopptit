/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class liet_ke_to_hop_1 {
    private static int[] a=new int[100];
    
    private static int tohopsinh(int k,int n){
	for(int i=1;i<=k;i++) a[i]=i;
        int dem=1;
	while(true){
            for(int i=1;i<=k;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println();
            int i=k;
            while(i>0&&a[i]>=n-k+i){
                i--;
            }
            if(i==0) return dem;
            a[i]=a[i]+1;
            for(int j=i+1;j<=k;j++){
                a[j]=a[i]+j-i;
            }
            dem++;
	}
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int dem=tohopsinh(k,n);
        System.out.println("Tong cong co "+dem+" to hop");
        
    }


}
