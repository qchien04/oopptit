package controller;

/*
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
//public class tong_phan_so {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        long a=sc.nextLong();
//        long b=sc.nextLong();
//        long c=sc.nextLong();
//        long d=sc.nextLong();
//        Fraction x=new Fraction(a,b);
//        Fraction y=new Fraction(c,d);
//        Fraction ans=Fraction.sum(x, y);
//        System.out.println(ans);
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
//    public static Fraction sum(Fraction a, Fraction b) {
//        long tuNew=a.tu*b.mau+b.tu*a.mau;
//        long mauNew=a.mau*b.mau;
//        return new Fraction(tuNew,mauNew);
//    }
//    @Override
//    public String toString() {
//        long g=gcd(this.tu,this.mau);
//        
//        return this.tu/g+"/"+this.mau/g;
//    }
//    
//}

