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
//import java.util.Comparator;
//import java.util.Scanner;
//
//
//public class danh_sach_mat_hang {
//    public static void main(String[] args) {
//        try {
//            Scanner sc=new Scanner(System.in);
//            int t=Integer.parseInt(sc.nextLine());
//            ArrayList<Product> a=new ArrayList<>();
//            while(t-->0){
//                String name=sc.nextLine();
//                String group=sc.nextLine();
//                long giamua=Long.parseLong(sc.nextLine());
//                long giaban=Long.parseLong(sc.nextLine());
//                a.add(new Product(name, group, giamua, giaban));
//
//            }
//            Collections.sort(a, (Product o1, Product o2) -> {
//                if(o1.getln()!=o2.getln()){
//                    return Long.compare(o2.getln(), o1.getln());
//                }
//                return o1.getMa().compareTo(o2.getMa());                
//            });
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
//    private String ma;
//    private String name;
//    private String group;
//    private long giamua;
//    private long giaban;
//
//    public Product(String name, String group, long giamua, long giaban) {
//        stt++;
//        this.ma =String.format("MH%03d", stt);
//        this.name = name;
//        this.group = group;
//        this.giamua = giamua;
//        this.giaban = giaban;
//    }
//
//    public long getGiamua() {
//        return giamua;
//    }
//
//    public void setGiamua(long giamua) {
//        this.giamua = giamua;
//    }
//
//    public long getGiaban() {
//        return giaban;
//    }
//
//    public void setGiaban(long giaban) {
//        this.giaban = giaban;
//    }
//    public long getln(){
//        return giaban-giamua;
//    }
//
//    public String getMa() {
//        return ma;
//    }
//
//    @Override
//    public String toString() {
//        return ma+" "+name+" "+group+" "+giamua+" "+giaban+" "+(giaban-giamua);
//    }
//    
//}
