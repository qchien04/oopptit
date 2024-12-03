///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Scanner;
//
///**
// *
// * @author chien
// */
//public class danh_sach_doi_tuong_sinh_vien_1 {
//public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=Integer.parseInt(sc.nextLine());
//        ArrayList<Student> arr=new ArrayList<>();
//        while(t-->0){
//            String name=sc.nextLine();
//            String lop=sc.nextLine();
//            String birth=sc.nextLine();
//            StringBuilder sb=new StringBuilder(birth);
//            if(sb.charAt(1)=='/'){
//                sb.insert(0, '0');
//            }
//            if(sb.charAt(1)=='/'){
//                sb.insert(0, '0');
//            }
//            if(sb.charAt(4)=='/'){
//                sb.insert(3, '0');
//            }
//            birth=sb.toString();
//            double gpa=Double.parseDouble(sc.nextLine());
//            Student s1=new Student(name, lop, birth, gpa);
//            arr.add(s1);
//        }
//        Collections.sort(arr,new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return Double.compare(o2.getGpa(), o1.getGpa());
//            }
//        });
//        for(Student i: arr){
//            System.out.println(i);
//        }
//        
//       
//    }
//}
//class Student {
//    private String name;
//    private String msv;
//    private String lop;
//    private String birth;
//    private double gpa;
//    private static int stt=0;
//
//    public Student(String name, String lop, String birth, double gpa) {
//        String n[] = name.trim().split("\\s+");
//        String rname = "";
//        for (String i : n) {
//            rname = rname + i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
//        }
//        this.name = rname;
//        stt++;
//        this.msv=String.format("B20DCCN%03d",stt);
//        this.lop = lop;
//        this.birth = birth;
//        this.gpa = gpa;
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
//    public String getMsv() {
//        return msv;
//    }
//
//    public void setMsv(String msv) {
//        this.msv = msv;
//    }
//
//    public String getLop() {
//        return lop;
//    }
//
//    public void setLop(String lop) {
//        this.lop = lop;
//    }
//
//    public String getBirth() {
//        return birth;
//    }
//
//    public void setBirth(String birth) {
//        this.birth = birth;
//    }
//
//    public double getGpa() {
//        return gpa;
//    }
//
//    public void setGpa(double gpa) {
//        this.gpa = gpa;
//    }
//
//    public static int getStt() {
//        return stt;
//    }
//
//    public static void setStt(int stt) {
//        Student.stt = stt;
//    }
//
//    @Override
//    public String toString() {
//        String d=String.format("%.2f",gpa);
//        return msv+" "+name+""+lop +" "+birth+" "+ d;
//    }
//    
//}