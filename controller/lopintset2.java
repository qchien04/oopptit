///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//
///**
// *
// * @author chien
// */
//import java.io.File;
//import java.io.IOException;
//import java.util.*;
//public class lopintset2 {
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(new File("DATA.in"));
//        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
//        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
//        for(int i = 0; i<m; i++) b[i] = sc.nextInt();
//        IntSet s1 = new IntSet(a);
//        IntSet s2 = new IntSet(b);
//        IntSet s3 = s1.intersection(s2);
//        System.out.println(s3);
//    }
//}
//
//
//class IntSet{
//   private int[] a;
//
//    public IntSet(int[] a) {
//        this.a = a;
//    }
//    public IntSet intersection(IntSet s2){
//        Set<Integer> se1=new TreeSet<>();
//        Set<Integer> se2=new TreeSet<>();
//        for(int i=0;i<a.length;i++){
//            se1.add(a[i]);
//        }
//        for(int i=0;i<s2.a.length;i++){
//            se2.add(s2.a[i]);
//        }
//        se1.retainAll(se2);
//        int[] aa=new int[se1.size()];
//        Integer[] s=se1.toArray(new Integer[0]);
//        for(int i=0;i<aa.length;i++){
//            aa[i]=s[i];
//        }
//        
//        return new IntSet(aa);
//    }
//
//    @Override
//    public String toString() {
//        String s="";
//        for(int i=0;i<a.length;i++){
//            s+=(a[i]+" ");
//        }
//        return s;
//    }
//    
//}