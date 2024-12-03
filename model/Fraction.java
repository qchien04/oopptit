/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chien
 */
public class Fraction {
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
        long tuNew=1;
        long mauNew=1;
        for(Fraction i: a){
            tuNew*=i.tu;
            mauNew*=i.mau;
        }
        long g=gcd(tuNew,mauNew);  
        return new Fraction(tuNew/g,mauNew/g);
    }
    
    @Override
    public String toString() {
        long g=gcd(this.tu,this.mau);
        
        return this.tu/g+"/"+this.mau/g;
    }
    
}
