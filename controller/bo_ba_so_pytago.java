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
public class bo_ba_so_pytago {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            long[] a=new long[n];
            for(int i=0;i<n;i++){
                long x=sc.nextLong();
                a[i]=x*x;
            }
            Arrays.sort(a);
            boolean check=false;
            int x=0,y=n-2,z=n-1;
            for(int i=n-1;i>=2;i--){
                long c=a[i];
                int l=0;
                int r=i-1;
                while(l<r){
                    if(a[r]+a[l]==c){
                        check=true;
                        break;
                    }
                    else if(a[r]+a[l]>c){
                        r--;
                    }
                    else{
                        l++;
                    }
                    if(check) break;
                }
                if(check) break;
                    
            }
            if(check) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
