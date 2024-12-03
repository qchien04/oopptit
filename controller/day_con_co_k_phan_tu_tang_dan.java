/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class day_con_co_k_phan_tu_tang_dan {
    public static ArrayList<String> ans;
    public static Integer[] a;
    public static int n,k;
    public static void solve2(int m,int head,String s){//wrong solution
        if(m==k){
            ans.add(s);
            return;
        }
        for(int i=head;i<n;i++){
            solve2(m+1,i+1,s+a[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            n=sc.nextInt();
            k=sc.nextInt();
            a=new Integer[n];
            ans=new ArrayList<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);
            solve2(0,0,"");
            for(int i=0;i<ans.size();i++){
                System.out.println(ans.get(i));
            }
        }
        
    }
}
