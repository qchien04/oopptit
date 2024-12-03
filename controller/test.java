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
public class test {
    private static boolean ktra(int[] a){
        for(int i=0;i<a.length/2;i++){
            if(a[i]!=a[a.length-i-1]) {
                System.out.println(a[i]+" "+a[a.length-i-1]);
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println(ktra(arr)==true?"YES" : "NO");
        }
    }
}
