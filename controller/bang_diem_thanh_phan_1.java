///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package controller;
//import java.util.*;
///**
// *
// * @author chien
// */
//public class bang_diem_thanh_phan_1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=Integer.parseInt(sc.nextLine());
//        ArrayList<Student> arr=new ArrayList<>();
//        while(t-->0){
//            String id=sc.nextLine();
//            String name=sc.nextLine();
//            String lop=sc.nextLine();
//            double d1=Double.parseDouble(sc.nextLine());
//            double d2=Double.parseDouble(sc.nextLine());
//            double d3=Double.parseDouble(sc.nextLine());
//            arr.add(new Student(id, name, lop, d1, d2, d3));
//            
//        }
//        Collections.sort(arr);
//        int cnt=1;
//        for(Student i:arr){
//
//            System.out.print(cnt+++" ");
//            System.out.println(i);
//        }
//    }
//}
//class Student implements Comparable<Student>{
//    private String id,name;
//    private String lop;
//    private double d1,d2,d3;
//
//    public Student(String id, String name, String lop, double d1, double d2, double d3) {
//        this.id = id;
//        this.name = name;
//        this.lop = lop;
//        this.d1 = d1;
//        this.d2 = d2;
//        this.d3 = d3;
//    }
//
//    @Override
//    public int compareTo(Student o) {
//        return this.name.compareTo(o.name);
//    }
//
//    @Override
//    public String toString() {
//        return id+" "+name+" "+lop+" "+String.format("%.1f",d1)+" "+String.format("%.1f",d2)+" "+String.format("%.1f",d3);
//    }
//    
//
//    
//    
//}