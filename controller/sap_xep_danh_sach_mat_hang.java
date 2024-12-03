///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Scanner;
//
///**
// *
// * @author chien
// */
//public class sap_xep_danh_sach_mat_hang {
//    public static void main(String[] args) {
//        try {
//            Scanner sc=new Scanner(System.in);
//            int t=Integer.parseInt(sc.nextLine());
//            ArrayList<Product> a=new ArrayList<>();
//            while(t-->0){
//                String name=sc.nextLine();
//                String group=sc.nextLine();
//                double giamua=Double.parseDouble(sc.nextLine());
//                double giaban=Double.parseDouble(sc.nextLine());
//                a.add(new Product(name, group, giamua, giaban));
//
//            }
//            Collections.sort(a, (Product a1, Product b) -> Double.compare(b.getGiaban()-b.getGiamua(), a1.getGiaban() - a1.getGiamua()));
//            for(Product i: a){
//                System.out.println(i);
//            }
//        } catch (NumberFormatException e) {
//            System.out.println(e);
//        }
//    }
//}
//class Product {
//    private static int stt=0;
//    private int ma;
//    private String name;
//    private String group;
//    private double giamua;
//    private double giaban;
//
//    public Product(String name, String group, double giamua, double giaban) {
//        stt++;
//        this.ma =stt;
//        this.name = name;
//        this.group = group;
//        this.giamua = giamua;
//        this.giaban = giaban;
//    }
//
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getGroup() {
//        return group;
//    }
//
//    public void setGroup(String group) {
//        this.group = group;
//    }
//
//    public double getGiamua() {
//        return giamua;
//    }
//
//    public void setGiamua(double giamua) {
//        this.giamua = giamua;
//    }
//
//    public double getGiaban() {
//        return giaban;
//    }
//
//    public void setGiaban(double giaban) {
//        this.giaban = giaban;
//    }
//    
//
//    @Override
//    public String toString() {
//        return ma+" "+name+" "+group+" "+String.format("%.2f", (giaban-giamua));
//    }
//    
//}
