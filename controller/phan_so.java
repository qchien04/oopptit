package controller;

///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package helloptit;
//
//import java.util.Scanner;
//
///**
// *
// * @author chien
// */
//public class phan_so {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        long a=sc.nextLong();
//        long b=sc.nextLong();
//        Fraction c=new Fraction(a,b);
//        System.out.println(c);
//    }
//}
//class Fraction {
//    private long tu;
//    private long mau;
//    public Fraction(long tu, long mau) {
//        this.tu = tu;
//        this.mau = mau;
//    }
//
//    public Fraction() {
//    }
//
//    public long getTu() {
//        return tu;
//    }
//
//    public void setTu(long tu) {
//        this.tu = tu;
//    }
//
//    public long getMau() {
//        return mau;
//    }
//
//    public void setMau(long mau) {
//        this.mau = mau;
//    }
//    private static long gcd(long a, long b) {
//        while (b != 0) {
//            long temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//        
//    }
//    
//    @Override
//    public String toString() {
//        long g=gcd(this.tu,this.mau);
//        
//        return this.tu/g+"/"+this.mau/g;
//    }
//    
//}
