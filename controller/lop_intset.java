/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author chien
 */
public class lop_intset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
        IntSet s1 = new IntSet(a);
        IntSet s2 = new IntSet(b);
        IntSet s3 = s1.union(s2);
        System.out.println(s3);
    }
}
class IntSet{
    Set<Integer> se;

    public IntSet(int[] a) {
        this.se = new TreeSet<>();
        for(int i:a){
            this.se.add(i);
        }
    }
    public IntSet union(IntSet other){
        Set<Integer> unionSet = new TreeSet<>(this.se);
        unionSet.addAll(other.se);
        return new IntSet(unionSet);
    }
    private IntSet(Set<Integer> set) {
        this.se = set;
    }
    @Override
    public String toString() {
        String ans="";
        for(int i:this.se){
            ans+=(i+" ");
        }
        return ans;
    }
    
}
