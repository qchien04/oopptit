///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Date;
//
///**
// *
// * @author chien
// */
//public class danh_sach_luu_tru {
//    public static void main(String[] args) throws ParseException {
//        try {
//            BufferedReader br=new BufferedReader(new FileReader("KHACH.in"));
//            int t=Integer.parseInt(br.readLine());
//            ArrayList<Customer> arr=new ArrayList<>();
//            for(int i=1;i<=t;i++){
//                String name=br.readLine();
//                String maPhong=br.readLine();
//                DateFormat dateformat=new SimpleDateFormat("dd/MM/yyyy");
//                Date ngayDen=dateformat.parse(br.readLine());
//                Date ngayDi=dateformat.parse(br.readLine());
//                Customer st=new Customer(name, maPhong, ngayDen, ngayDi);
//                arr.add(st);
//            }
//            Collections.sort(arr,new Comparator<Customer>(){
//                @Override
//                public int compare(Customer a,Customer b){
//                    return Long.compare(b.getSongayluutru(),a.getSongayluutru());
//                }
//            });
//            for(Customer i:arr){
//                System.out.println(i);
//            }
//        } catch (IOException | NumberFormatException e) {
//            System.out.println(e);
//        }
//
//    }
//}
//class Customer {
//    private static int stt;
//    private String mkh;
//    private String name;
//    private String maPhong;
//    private Date ngayDen;
//    private Date ngayDi;
//    private long songayluutru;
//    public Customer(String name, String maPhong, Date ngayDen, Date ngayDi) {
//        this.name = name;
//        this.maPhong = maPhong;
//        this.ngayDen = ngayDen;
//        this.ngayDi = ngayDi;
//        stt++;
//        String ma=stt+"";
//        while(ma.length()<2){
//            ma="0"+ma;
//        }
//        ma="KH"+ma;
//        this.mkh=ma;
//        
//        this.songayluutru=(ngayDi.getTime()-ngayDen.getTime())/(1000L*24*60*60);
//    }
//
//    public static int getStt() {
//        return stt;
//    }
//
//    public static void setStt(int stt) {
//        Customer.stt = stt;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getMaPhong() {
//        return maPhong;
//    }
//
//    public void setMaPhong(String maPhong) {
//        this.maPhong = maPhong;
//    }
//
//
//    public String getMkh() {
//        return mkh;
//    }
//
//    public long getSongayluutru() {
//        return songayluutru;
//    }
//
//    @Override
//    public String toString() {
//        return mkh + " " + name + " " + maPhong + " " +songayluutru;
//    }
//    
//    
//}