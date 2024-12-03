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
public class xau_nhi_phan {
    private static long[] fibo=new long[93];
    public static long solve(int  n, long k){
	if(n==1) return 0;
        if(n==2) return 1;
	if(k<=fibo[n-2]) return solve(n-2,k);
        else return solve(n-1,k-fibo[n-2]);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        fibo[1]=1;
        fibo[2]=1;
        for(int i=3;i<93;i++){
            fibo[i]=fibo[i-1]+ fibo[i-2];
        }
        while(t-- >0){
            int n=sc.nextInt();
            long k=sc.nextLong();;
            System.out.println(solve(n,k));
        }
    }
}
