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
public class ma_tran_xoan_oc_tang_dan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n*n];
        for(int i=0;i<n*n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int b[][]=new int[n][n];
        int h1=0,h2=n-1,c1=0,c2=n-1;
        int stt=0;
        while(h1<=h2&&c1<=c2){
            for(int i=c1;i<=c2;i++){
                b[h1][i]=a[stt];
                stt++;
            }
            h1++;
            for(int i=h1;i<=h2;i++){
                b[i][c2]=a[stt];
                stt++;
            }
            c2--;
            for(int i=c2;i>=c1;i--){
                b[h2][i]=a[stt];
                stt++;
            }
            h2--;
            for(int i=h2;i>=h1;i--){
                b[i][c1]=a[stt];
                stt++;
            }
            c1++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
