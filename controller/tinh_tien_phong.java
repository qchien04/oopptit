///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//
///**
// *
// * @author chien
// */
//public class tinh_tien_phong {
//    public static void main(String[] args) throws FileNotFoundException {
//        Scanner sc=new Scanner(new File("KHACHHANG.in"));
//        int t=Integer.parseInt(sc.nextLine());
//        ArrayList<khach> arr=new ArrayList<>();
//        while(t-->0){
//            String name=sc.nextLine();
//            String phong=sc.nextLine();
//            String n1=sc.nextLine();
//            String n2=sc.nextLine();
//            int dv=Integer.parseInt(sc.nextLine());
//            arr.add(new khach(name, phong, n1, n2, dv));
//        }
//        Collections.sort(arr);
//        for(khach i:arr){
//            System.out.println(i);
//        }
//    }
//}
//class khach implements Comparable<khach>{
//    private static int stt=0;
//    private String id,name,phong,n1,n2;
//    private int dv;
//    public khach(String name, String phong, String n1, String n2, int dv) {
//        this.id = String.format("KH%02d", ++stt);
//        this.name = name;
//        this.phong = phong;
//        this.n1 = n1;
//        this.n2 = n2;
//        this.dv = dv;
//    }
//
//    @Override
//    public String toString() {
//        return id+" "+name+" "+phong+" "+getngay()+" "+gettien();
//    }
//    
//    private long gettien(){
//        return getgiaphong()*getngay()+dv;
//    }
//    private int getgiaphong(){
//        char c=phong.charAt(0);
//        if(c=='1') return 25;
//        if(c=='2') return 34;
//        if(c=='3') return 50;
//        if(c=='4') return 80;
//        return 0;
//    }
//    private long getngay(){
//        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
//        try {
//            Date d1=df.parse(n1);
//            Date d2=df.parse(n2);
//            return (d2.getTime()-d1.getTime())/1000/3600/24+1;
//        } catch (ParseException ex) {
//            Logger.getLogger(khach.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return 0;
//    }
//
//    @Override
//    public int compareTo(khach o) {
//        return Long.compare(o.gettien(), gettien());
//    }
//}
//
