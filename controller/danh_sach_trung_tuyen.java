///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.text.DecimalFormat;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
///**
// *
// * @author chien
// */
//public class danh_sach_trung_tuyen {
//
//    public static void main(String[] args) {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("THISINH.in"));
//            int t = Integer.parseInt(br.readLine());
//            ArrayList<Student> a=new ArrayList<>();
//            while (t-- > 0) {
//                String ma = br.readLine();
//                String name = br.readLine();
//                double d1 = Double.parseDouble(br.readLine());
//                double d2 = Double.parseDouble(br.readLine());
//                double d3 = Double.parseDouble(br.readLine());
//                a.add(new Student(ma, name, d1, d2, d3));
//            }
//            Collections.sort(a, new Comparator<Student>(){
//                @Override
//                public int compare(Student a,Student b){
//                    return Double.compare(b.getTotal(), a.getTotal());
//                }
//            });
//            t = Integer.parseInt(br.readLine());
//            Double dc=a.get(t-1).getTotal();
//            System.out.printf("%.1f",dc);
//            System.out.println("");
//            for(Student i:a){
//                System.out.print(i);
//                if(i.getTotal()>=dc) System.out.println(" TRUNG TUYEN");
//                else System.out.println(" TRUOT");
//            }
//        } catch (Exception e) {
//        }
//    }
//}
//
//class Student {
//
//    private String ma;
//    private String name;
//    private double d1, d2, d3;
//    private double ut;
//    private double total;
//
//    public Student(String ma, String name, double d1, double d2, double d3) {
//        String n[] = name.trim().split("\\s+");
//        String rname = "";
//        for (String i : n) {
//            rname = rname + i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
//        }
//        this.name = rname;
//        this.ma = ma;
//        this.d1 = d1;
//        this.d2 = d2;
//        this.d3 = d3;
//        this.ut=uutien(this.ma);
//        this.total = d1 * 2 + d2 + d3 + ut;
//    }
//
//    public double uutien(String ma) {
//        String kv = ma.substring(0, 3);
//        switch (kv) {
//            case "KV1":
//                return 0.5;
//            case "KV2":
//                return 1.0;
//            case "KV3":
//                return 2.5;
//            default:
//                throw new AssertionError();
//        }
//    }
//
//    public double getTotal() {
//        return total;
//    }
//    
//    @Override
//    public String toString() {
//        DecimalFormat df = new DecimalFormat("#.#");
//        return ma+" "+name + ""+df.format(ut) + " " +df.format(total);
//    }
//
//}
