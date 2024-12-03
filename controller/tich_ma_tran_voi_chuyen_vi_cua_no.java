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
public class tich_ma_tran_voi_chuyen_vi_cua_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=1;l<=t;l++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            long[][] a=new long[n+1][m+1];
            long[][] b=new long[m+1][n+1];
            long[][] c=new long[n+1][n+1];
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    a[i][j]=sc.nextLong();
                }
            }
            for(int i=1;i<=m;i++){
                for(int j=1;j<=n;j++){
                    b[i][j]=a[j][i];
                }
            }
            for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++){
                    c[i][j]=0;
                    for(int k=1;k<=m;k++){
                        c[i][j]+=(a[i][k]*b[k][j]);
                    }
		}
            }
            System.out.println("Test "+l+":");
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }  
            
        }   
    }
}
