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
public class sap_xep_chon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            System.out.print("Buoc "+(i+1)+": ");
            int index=i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[index]){
                    index=j;
                }
            }
            if(index!=i){
                int tmp=arr[i];
                arr[i]=arr[index];               
                arr[index]=tmp;
            }
            for(int k=0;k<n;k++){
                System.out.print(arr[k]+" ");
            }
            System.out.println();
        }
    }
}
