///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//
//import java.util.*;
//
///**
// *
// * @author chien
// */
//public class bang_theo_doi_nhap_xuat_hang {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=Integer.parseInt(sc.nextLine());
//        ArrayList<Hang> arr=new ArrayList<>();
//        while(t-->0){
//            String ma=sc.nextLine();
//            long nhap=Long.parseLong(sc.nextLine());
//
//            arr.add(new Hang(ma, nhap));
//        }
//        for(Hang i:arr){      
//            System.out.println(i);
//            
//        }  
//    }
//}
//class Hang{
//    private String ma;
//    private long nhap;
//
//    public Hang(String ma, long nhap) {
//        this.ma = ma;
//        this.nhap = nhap;
//    }
//    private long getSoLuongXuatHang(){
//        if(ma.startsWith("A")){
//            return Math.round((double)nhap*60/100);
//        }
//        return Math.round((double)nhap*70/100);
//    }
//    private long getDonGia(){
//        if(ma.endsWith("Y")){
//            return 110000;
//        }
//        return 135000;
//    }
//    private long getTaxPercent(){
//        if(ma.endsWith("Y")&&ma.startsWith("A")) return 8;
//        if(ma.endsWith("N")&&ma.startsWith("A")) return 11;
//        if(ma.endsWith("Y")&&ma.startsWith("B")) return 17;
//        return 22;
//    }
//    private long getTien(){
//        return getSoLuongXuatHang()*getDonGia();
//    }
//    private long getTax(){
//        return getTien()/100*(getTaxPercent());
//    }
//    @Override
//    public String toString() {
//        return ma+" "+nhap+" "+getSoLuongXuatHang()+" "+getDonGia()+" "+getTien()+" "+getTax();
//    }
//    
//    
//}