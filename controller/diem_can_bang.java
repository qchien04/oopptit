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
public class diem_can_bang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- >0){
            int n=sc.nextInt();
            int sum=0;
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                sum+=a[i];
            }
            int s=0;
            int res=-1;
            for(int i=0;i<n;i++){
                sum-=a[i];
                if(s==sum){
                    res=i+1;
                    break;
                }
                s+=a[i];
            }
            System.out.println(res);
        }
    }
}
