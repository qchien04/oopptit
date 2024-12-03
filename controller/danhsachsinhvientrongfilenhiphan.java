///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package danhsachsinhvien1;
//
///**
// *
// * @author chien
// */
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//import java.io.Serializable;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.*;
//public class danhsachsinhvientrongfilenhiphan {
//    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//        ObjectInputStream ob=new ObjectInputStream(new FileInputStream("SV.in"));
//        
//        
//        ArrayList<SinhVien> arr=(ArrayList<SinhVien>) ob.readObject();
//        for(SinhVien i:arr){
//            System.out.println(i);
//        }
//    
//    }
//}
//
//class SinhVien implements Serializable{
//    private String ma,ten,lop;
//    private Date ngaysinh;
//    private float gpa;
//
//    public SinhVien(int id,String name, String lop, String ns, float gpa) throws ParseException {
//        this.ma=String.format("B20DCCN%03d", id);
//        this.ten = name;
//        this.lop = lop;
//        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
//        
//        this.ngaysinh= df.parse(ns);
//        this.gpa = gpa;
//    }
//
//    @Override
//    public String toString() {
//        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
//        return ma+" "+ten+" "+lop+" "+df.format(ngaysinh)+" "+String.format("%.2f", gpa);
//    }
//}