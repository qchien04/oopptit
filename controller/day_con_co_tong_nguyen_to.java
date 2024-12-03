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
public class day_con_co_tong_nguyen_to {
    public static ArrayList<String> ans;
    public static Integer[] a;
    public static Integer[] b;
    public static int n;
    private static boolean[] nt = new boolean[1000002];
    public static void sang(){
        Arrays.fill(nt, true);
        nt[0] = nt[1] = false;

        for (int p = 2; p * p <= 1000001; p++) {
            if (nt[p]) {
                for (int j = p * p; j <= 1000001; j += p) {
                    nt[j] = false;
                }
            }
        }
    }
    public static void check(){
        int sum=0;
        String s="";
        for(int i=0;i<n;i++){
            if(b[i]==1){
                sum+=a[i];
                s=s+a[i]+" ";                       
            }  
        }
        if(nt[sum]) ans.add(s);
    }
    public static void solve2(int m){//wrong solution
        for(int i=0;i<=1;i++){
            if(m==n){
                check();
                return;
            }
            b[m]=i;
            solve2(m+1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        sang();
        while(t-->0){
            n=Integer.parseInt(sc.nextLine());
            a=new Integer[n];
            b=new Integer[n];
            ans=new ArrayList<>();
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            sc.nextLine();
            Arrays.sort(a,(x,y)-> y-x);

            solve2(0);
            for(int i=0;i<ans.size();i++){
                System.out.println(ans.get(i));
            }
        }
        
    }
}
