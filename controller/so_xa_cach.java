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
public class so_xa_cach {
    private static int[] a=new int[100];
    private static int n;
    private static int k;
    private static boolean[] vs=new boolean[100];
    private static void khoitao(){
        for(int i=1;i<=n;i++) vs[i]=true;
	hvdq(1);
    }
    private static boolean check(StringBuilder s){
	for(int i=1;i<s.length();i++){
		if((s.charAt(i)-s.charAt(i-1))==1||(s.charAt(i)-s.charAt(i-1))==-1) return false;
	}
	return true;
}
    private static void hvdq(int m){
	if(m>n){
            StringBuilder s=new StringBuilder();
            for(int i=1;i<=n;i++){
                    s.append(a[i]);
            }
            if(check(s)) System.out.println(s);
            return;
	}
	for(int i=1;i<=n;i++){
		if(vs[i]){
                    a[m]=i;
                    vs[i]=false;
                    hvdq(m+1);
                    vs[i]=true;
		}
	}
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            n=sc.nextInt();
            khoitao();
        }
    }
    
}
