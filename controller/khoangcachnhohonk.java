/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author chien
 */
import java.util.*;
public class khoangcachnhohonk {
    
    private static int bound(int[] a,int n,int k){
        int l=0,r=n;
        while(l<r){
            int mid=l+(r-l)/2;
            if(a[mid]<k){
                l=mid+1;
            }
            else{
                r=mid;
            }
            
        }
        return l;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            Arrays.sort(a);

            long ans=0;
            for(int i=0;i<n;i++){
                int key=a[i]+k;
                int limit=bound(a, n, key)-1;
                ans+=(long)(limit-i>0?(limit-i):0);
            }
            System.out.println(ans);
            
            
        }
        
        
    }
}