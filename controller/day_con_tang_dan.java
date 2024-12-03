/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author chien
 */
public class day_con_tang_dan {
    private static int[] a=new int[21];
    private static int n;
    private static Set<String> se=new TreeSet<>();
    private static void cre(int i,int cnt,String dayso){
        for(int j=i+1;j<=n;j++){
            if(a[j]>a[i]){
                if(cnt>=1){
                    se.add(dayso+a[j]+" ");
                }
                cre(j,cnt+1,dayso+a[j]+" ");
            }
        }
    }
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new FileReader("DAYSO.in"));
            n=Integer.parseInt(br.readLine());
            String s[]=br.readLine().trim().split("\\s+");
            a[0]=0;
            for(int i=0;i<s.length;i++){
                a[i+1]=Integer.parseInt(s[i]);
            }
            cre(0,0,"");
            for(String i:se){
                System.out.println(i);
            }
        } catch (Exception e) {
        }
    }
}
