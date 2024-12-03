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
//public class xep_loai {
//
//    public static void main(String[] args) {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("BANGDIEM.in"));
//            int t = Integer.parseInt(br.readLine());
//            ArrayList<Student> a=new ArrayList<>();
//            while (t-- > 0) {
//                String name = br.readLine();
//                double d1 = Double.parseDouble(br.readLine());
//                double d2 = Double.parseDouble(br.readLine());
//                double d3 = Double.parseDouble(br.readLine());
//                a.add(new Student(name, d1, d2, d3));
//            }
//            Collections.sort(a, new Comparator<Student>(){
//                @Override
//                public int compare(Student a,Student b){
//                    return Double.compare(b.getTotal(), a.getTotal());
//                }
//            });
//            for(Student i: a){
//                System.out.println(i);
//            }
//
//            
//        } catch (Exception e) {
//        }
//    }
//}
//
//class Student {
//    private static int stt=0;
//    private String ma;
//    private String name;
//    private double d1, d2, d3;
//    private double total;
//
//    public Student(String name, double d1, double d2, double d3) {
//        String n[] = name.trim().split("\\s+");
//        String rname = "";
//        for (String i : n) {
//            rname = rname + i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
//        }
//        stt++;
//        this.name = rname;
//        this.ma = String.format("SV%02d",stt);
//        this.d1 = d1;
//        this.d2 = d2;
//        this.d3 = d3;
//        this.total =d1 * 0.25 + d2*0.35 + d3*0.4;
//    }
//
//    public double getTotal() {
//        return total;
//    }
//    public String xeploai(double a) {
//        if(a>=5 && a<6.5) return "TRUNG BINH";
//        if(a>=6.5 && a<8) return "KHA";
//        if(a>=8) return "GIOI";
//        return "KEM"; 
//    }
//    @Override
//    public String toString() {
//        return ma+" "+name + ""+String.format("%.2f",total)+" "+ xeploai(total);
//    }
//
//}
