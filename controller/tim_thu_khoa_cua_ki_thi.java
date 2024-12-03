///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
///**
// *
// * @author chien
// */
//public class tim_thu_khoa_cua_ki_thi {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=Integer.parseInt(sc.nextLine());
//        double max=20000;
//        ArrayList<Student> a=new ArrayList<>();
//        while(t-->0){
//            String name=sc.nextLine();
//            String birth=sc.nextLine();
//            double d1=Double.parseDouble(sc.nextLine());
//            double d2=Double.parseDouble(sc.nextLine());
//            double d3=Double.parseDouble(sc.nextLine());
//            Student s1=new Student(name, birth, d1, d2, d3);
//            a.add(s1);
//        }
//        for(Student i:a){
//            if(i.getTotal()==Student.maxx){
//                System.out.println(i);
//            }
//        }
//    }
//}
//class Student {
//    private static int stt=0;
//    private int code;
//    private String name;
//    private String birth;
//    private double d1,d2,d3;
//    public static double maxx=-1;
//    public Student(String name, String birth, double d1, double d2, double d3) {
//        stt++;
//        this.code=stt;
//        this.name = name;
//        this.birth = birth;
//        this.d1 = d1;
//        this.d2 = d2;
//        this.d3 = d3;
//        if (d1+d2+d3>maxx){
//            maxx=d1+d3+d2;
//        }
//    }
//
//    public double getTotal() {
//        return d1+d2+d3;
//    }
//    
//    @Override
//    public String toString() {
//        String dtb=String.format("%.1f",d1+d2+d3);
//        return code+" "+name +" "+birth+" "+ dtb;
//    }
//    
//}
//
