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
public class bo_sung_day_so {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int minn=a[0];
        int maxx=a[n-1];
        for(int i=1;i<minn;i++){
            System.out.println(i);
        }
        for(int i=1;i<n;i++){
            if(a[i]-a[i-1]>1){
                for(int j=a[i-1]+1;j<a[i];j++){
                    System.out.println(j);
                }
            }
        }
        if(minn==1&&maxx==n) System.out.println("Excellent!");
    }
}
