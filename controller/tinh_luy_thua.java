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
public class tinh_luy_thua {
    private static long p =(long) (1e9+7);
    public static long luythua(long  x, long y){
	if(y==0) return 1;
	if(y%2==0){
		long t=luythua(x,y/2);
		return (t*t)%p;
	}
	else{
		long t=luythua(x,y-1);
		return (t*x)%p;
	}	
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            try {
                long a=sc.nextLong();
                long b=sc.nextLong();
                if(a==0&&b==0){
                    throw new Exception();
                }
                System.out.println(luythua(a,b));
            } catch (Exception e) {
                System.exit(0);
            }
        }
    }
}
