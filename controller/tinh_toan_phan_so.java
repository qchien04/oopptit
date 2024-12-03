package controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author chien
 */
public class tinh_toan_phan_so {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long c=sc.nextLong();
            long d=sc.nextLong();
            Fraction x=new Fraction(a,b);
            Fraction y=new Fraction(c,d);
            Fraction sum=Fraction.sum1(x, y);
            Fraction sum2=Fraction.time1(sum, sum);
            System.out.print(sum2+" ");
            Fraction tich=Fraction.time2(sum2,x,y);
            System.out.println(tich);
        }

    }
}
class Fraction {
    private long tu;
    private long mau;
    public Fraction(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public Fraction() {
    }

    public long getTu() {
        return tu;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public long getMau() {
        return mau;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }
    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
        
    }
    public static Fraction sum1(Fraction a, Fraction b) {
        long tuNew=a.tu*b.mau+b.tu*a.mau;
        long mauNew=a.mau*b.mau;
        long g=gcd(tuNew,mauNew);  
        return new Fraction(tuNew/g,mauNew/g);
    }
    public static Fraction time1(Fraction a, Fraction b) {
        long tuNew=a.tu*b.tu;
        long mauNew=a.mau*b.mau;
        long g=gcd(tuNew,mauNew);  
        return new Fraction(tuNew/g,mauNew/g);
    }
    
    public static Fraction time2(Fraction... a) {
        Fraction tmp=new Fraction(1,1);
        for(Fraction i: a){
            tmp=Fraction.time1(tmp, i);
        }
        long tuNew=tmp.tu;
        long mauNew=tmp.mau;
        long g=gcd(tuNew,mauNew);  
        return new Fraction(tuNew/g,mauNew/g);
    }
    
    @Override
    public String toString() {
        long g=1;
        
        return this.tu/g+"/"+this.mau/g;
    }
    
}
