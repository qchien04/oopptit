///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//
//import java.util.Scanner;
//
///**
// *
// * @author chien
// */
//public class so_phuc {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-- >0) {
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            int c = sc.nextInt();
//            int d = sc.nextInt();
//            Complex A = new Complex(a,b);
//            Complex B = new Complex(c,d);
//            Complex sum = A.add(B);
//            Complex C = sum.multiply(A);
//            Complex D = sum.square();
//            System.out.println(C+", "+D);
//        }
//    }
//}
//class Complex {
//    private int real;
//    private int imag;
//
//    public Complex(int real, int imag) {
//        this.real = real;
//        this.imag = imag;
//    }
//
//    public Complex add(Complex other) {
//        return new Complex(this.real + other.real, this.imag + other.imag);
//    }
//
//    public Complex multiply(Complex other) {
//        int realPart = this.real * other.real - this.imag * other.imag;
//        int imagPart = this.real * other.imag + this.imag * other.real;
//        return new Complex(realPart, imagPart);
//    }
//
//    public Complex square() {
//        int realPart = this.real * this.real - this.imag * this.imag;
//        int imagPart = 2 * this.real * this.imag;
//        return new Complex(realPart, imagPart);
//    }
//
//    @Override
//    public String toString() {
//        if (imag >= 0) {
//            return real + " + " + imag + "i";
//        } else {
//            return real + " - " + Math.abs(imag) + "i";
//        }
//    }
//}
