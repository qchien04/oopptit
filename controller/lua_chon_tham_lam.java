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
public class lua_chon_tham_lam {
    private static void nhonhat(int s,int d){
	if(s>9*d||s==0){
            System.out.print("-1 ");
            return;
	}
	int[] a=new int[d+1];
	int sum=s-1;
	for(int i=0;i<d-1;i++){
		if(sum<9) {
                    a[i]=sum;
                    sum=0;
		}
		else {
                    a[i]=9;
                    sum-=9;
		}
	}
	a[d-1]=sum+1;
	for(int i=d-1;i>=0;i--){
            System.out.print(a[i]);
	}
	System.out.print(" ");
        return;
    }
    private static void lonnhat(int s,int d){
	if(s>9*d||s==0){
            System.out.print("-1 ");
            return;
	}
	int[] a=new int[d+1];
	for(int i=0;i<d;i++){
		if(s<9) {
                    a[i]=s;
                    s=0;
		}
		else {
                    a[i]=9;
                    s-=9;
		}
	}
	for(int i=0;i<d;i++){
            System.out.print(a[i]);
	}
        System.out.print(" ");
        return;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int d=sc.nextInt();
        nhonhat(d, s);
        lonnhat(d, s);
    }
}
