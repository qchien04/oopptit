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
//import java.util.*;
//public class lap_bang_tinh_cong {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=Integer.parseInt(sc.nextLine());
//        ArrayList<NhanVien> arr=new ArrayList<>();
//        while(t-->0){
//            String name=sc.nextLine();
//            long ln=Long.parseLong(sc.nextLine());
//            long nc=Long.parseLong(sc.nextLine());
//            String cv=sc.nextLine();
//            arr.add(new NhanVien(name, ln, nc, cv));
//        }
//        Collections.sort(arr);
//        for(NhanVien i:arr){
//            System.out.println(i);
//        }    
//    }
//}
//
//
//class NhanVien implements Comparable<NhanVien>{
//    private static int stt=0;
//    public static long sum=0;
//    private String id,name,cv;
//    private long luong,nc;
//    
//
//
//    public NhanVien(String name, long ln, long nc,String cv) {
//        stt++;
//        this.name=name;
//        this.id=String.format("NV%02d", stt);
//        this.nc=nc;
//        this.luong=getluong(ln, nc);
//        this.cv=cv;
//        
//    }   
//    private long getluong(long ln,long nc){
//        return ln*nc;
//    }
//    private long getThuong(long nc){
//        if(nc>=25) return (long)(luong*0.2);
//        if(nc>=22) return (long)(luong*0.1);
//        return 0;
//    }
//    private long getPc(String cv){
//        if(cv.equals("GD")) return 250000;
//        if(cv.equals("PGD")) return 200000;
//        if(cv.equals("TP")) return 180000;
//        return 150000;
//    }
//    private long getTotal(){
//        long a=getThuong(nc)+getPc(cv)+luong;
//        sum+=a;
//        return a;
//        
//    }
//
//    @Override
//    public String toString() {
//        return id+" "+name+" "+luong+" "+getThuong(nc)+" "+getPc(cv)+" "+getTotal();
//    }
//
//    @Override
//    public int compareTo(NhanVien o) {
//        return -Long.compare(getTotal(), o.getTotal());
//    }
//    
//}