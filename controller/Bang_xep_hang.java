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
//public class Bang_xep_hang {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int t=Integer.parseInt(sc.nextLine());
//        ArrayList<SinhVien> arr=new ArrayList<>();
//        while(t-->0){
//            String name=sc.nextLine();
//            String[] a=sc.nextLine().split("\\s+");
//            long d1=Long.parseLong(a[0]);
//            long d2=Long.parseLong(a[1]);
//            arr.add(new SinhVien(name, d1, d2));
//        }
//        Collections.sort(arr, new Comparator<SinhVien>(){
//            @Override
//            public int compare(SinhVien o1, SinhVien o2) {
//                if(o1.getD1()!=o2.getD1()) return Long.compare(o2.getD1(),o1.getD1());
//                if(o1.getD2()!=o2.getD2()) return Long.compare(o1.getD2(),o2.getD2());
//                return o1.getName().compareTo(o2.getName());
//            }
//            
//        });
//        for(SinhVien i: arr){
//            System.out.println(i);
//        }
//    }
//}
//class SinhVien{
//    private String name;
//    private long d1,d2;
//
//    public SinhVien(String name, long d1, long d2) {
//        this.name = name;
//        this.d1 = d1;
//        this.d2 = d2;
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
//    public long getD1() {
//        return d1;
//    }
//
//    public void setD1(long d1) {
//        this.d1 = d1;
//    }
//
//    public long getD2() {
//        return d2;
//    }
//
//    public void setD2(long d2) {
//        this.d2 = d2;
//    }
//
//    @Override
//    public String toString() {
//        return name+" "+d1+" "+d2;
//    }
//    
//}