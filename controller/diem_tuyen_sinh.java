///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
///**
// *
// * @author chien
// */
//public class diem_tuyen_sinh {
//    public static void main(String[] args) {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("THISINH.in"));
//            int t = Integer.parseInt(br.readLine());
//            ArrayList<KH> a=new ArrayList<>();
//            while (t-- > 0) {
//                String name = br.readLine();
//                double diem=Double.parseDouble(br.readLine());
//                String dantoc=br.readLine();
//                int khuvuc=Integer.parseInt(br.readLine());
//                a.add(new KH(name, diem, dantoc, khuvuc));
//            }
//            Collections.sort(a, new Comparator<KH>(){
//                @Override
//                public int compare(KH a,KH b){
//                    if(b.getTotal()!=a.getTotal()){
//                    return Double.compare(b.getTotal(), a.getTotal());
//                    }
//                    return a.getMa().compareTo(b.getMa());
//                }
//            });
//            for(KH i: a){
//                System.out.println(i);
//            }
//
//            
//        } catch (Exception e) {
//        }
//        
//    }
//}
//class KH {
//    private static int stt=0;
//    private String ma;
//    private String name;
//    private String dantoc;
//    private double diem;
//    private int khuvuc;
//    private double total;
//
//
//    public KH(String name, double diem, String dantoc, int khuvuc) {
//        String n[] = name.trim().split("\\s+");
//        String rname = "";
//        for (String i : n) {
//            rname = rname + i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
//        }
//        stt++;
//        this.name = rname;
//        this.ma = String.format("TS%02d",stt);
//        this.diem = diem;
//        this.dantoc = dantoc;
//        this.khuvuc=khuvuc;
//        this.total=getut(khuvuc)+this.diem+(dantoc.equals("Kinh")?0:1.5);
//        
//    }
//
//    public double getTotal() {
//        return total;
//    }
//    public double getut(int a){
//        if (a==1) return 1.5;
//        if (a==2) return 1;
//        return 0;
//    }
//    
//
//    public String getMa() {
//        return ma;
//    }
//    
//    @Override
//    public String toString() {
//        return ma+" "+name + ""+String.format("%.1f", getTotal())+" "+(this.getTotal()>=20.5?"Do":"Truot");
//    }
//
//}
//
