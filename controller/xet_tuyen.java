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
//public class xet_tuyen {
//
//    public static void main(String[] args) {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader("XETTUYEN.in"));
//            int t = Integer.parseInt(br.readLine());
//            ArrayList<Student> a=new ArrayList<>();
//            while (t-- > 0) {
//                String name = br.readLine();
//                String birth = br.readLine();
//                double d1 = Double.parseDouble(br.readLine());
//                double d2 = Double.parseDouble(br.readLine());
//                a.add(new Student(name, birth, d1, d2));
//            }
////            Collections.sort(a, new Comparator<Student>(){
////                @Override
////                public int compare(Student a,Student b){
////                    return Double.compare(b.getTotal(), a.getTotal());
////                }
////            });
//            for(Student i:a){
//                System.out.println(i);
//                
//            }
//        } catch (Exception e) {
//        }
//    }
//}
//
//class Student {
//    private static int stt=0;
//    private String ma;
//    private String name;
//    private int tuoi;
//    private double d1, d2;
//    private double total;
//
//    public Student(String name, String birth, double d1, double d2) {
//        String n[] = name.trim().split("\\s+");
//        String rname = "";
//        for (String i : n) {
//            rname = rname + i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
//        }
//        this.name = rname;
//        //ngay sinh
//        StringBuilder sb=new StringBuilder(birth);
//        if(sb.charAt(1)=='/'){
//            sb.insert(0, '0');
//        }
//        if(sb.charAt(1)=='/'){
//            sb.insert(0, '0');
//        }
//        if(sb.charAt(4)=='/'){
//            sb.insert(3, '0');
//        }
//        this.tuoi=2021-(Integer.parseInt(sb.toString().substring(6)));
//        
//        stt++;
//        this.ma = String.format("PH%02d", stt);
//        this.d1 = d1;
//        this.d2 = d2;
//        if(d1>=8.0&&d2>=8.0){
//            this.total=1;
//        }
//        else if(d1>=7.5&&d2>=7.5){
//            this.total=0.5;
//        }
//        else this.total=0;
//        this.total +=((d1 + d2)/2);
//        if(this.total>10.0){
//            this.total=10;
//        }
//    }
//
//
//    public double getTotal() {
//        return total;
//    }
//    public String xeploai(long a) {
//        if(a==5||a==6) return "Trung binh";
//        if(a==7) return "Kha";
//        if(a==8) return "Gioi";
//        if(a==9||a==10) return "Xuat sac";
//        return "Truot"; 
//    }
//    @Override
//    public String toString() {
//        long d=Math.round(total);
//        return ma+" "+name + ""+tuoi+" " +d+" "+xeploai(d);
//    }
////    @Override
////    public String toString() {
////        return ma+" "+name + ""+tuoi+" " +Math.round(total);
////    }
//
//}
