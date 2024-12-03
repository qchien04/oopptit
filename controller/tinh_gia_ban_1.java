///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//import java.util.*;
///**
// *
// * @author chien
// */
//public class tinh_gia_ban_1 {
//    
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=Integer.parseInt(sc.nextLine());
//        
//        while(t-->0){
//            String name=sc.nextLine();
//            String dv=sc.nextLine();
//            long giamua=Integer.parseInt(sc.nextLine());
//            long quantity=Integer.parseInt(sc.nextLine());
//            Product a=new Product(name, dv, giamua, quantity);
//            System.out.println(a);
//        }
//    }
//}
//class Product {
//    private static int stt=0;
//    private String ma;
//    private String name;
//    private String donvi;
//    private long giamua;
//    private long quantity;
//
//    public Product(String name, String donvi, long giamua, long quantity) {
//        stt++;
//        this.ma = String.format("MH%02d", stt);
//        this.name = name;
//        this.donvi = donvi;
//        this.giamua = giamua;
//        this.quantity = quantity;
//    }
//
//    public String getMa() {
//        return ma;
//    }
//
//    public void setMa(String ma) {
//        this.ma = ma;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public double getGiamua() {
//        return giamua;
//    }
//
//    private long phivanchuyen(){
//        int a=Math.round(giamua*quantity*5/100);
//        return a;
//    }
//    private long thanhtien(){
//        return giamua*quantity+phivanchuyen();
//    }
//    public String giaban(){
//        double a=(double)thanhtien()*102/100;
//        return String.format("%.0f",a);
//    }
//
//    @Override
//    public String toString() {
//        return ma+" "+name+" "+donvi+" "+phivanchuyen()+" "+thanhtien()+" "+giaban();
//    }
//    
//}
