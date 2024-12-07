///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package javaapplication1;
//
//import java.util.Scanner;
//
///**
// *
// * @author chien
// */
//public class achcs {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        Sach s = new SachGiaoKhoa();
//        ((SachGiaoKhoa) s).nhap(in);
//        System.out.println(s);
//        ((SachGiaoKhoa) s).nhap(in);
//        System.out.println(s);
//    }
//}
//class Sach{
//    protected String ma;
//    private String ten;
//    private String nhaXB;
//    protected double gia;
//    protected int sMa=0;
//
//    public String getMa() {
//        return ma;
//    }
//
//    public void setMa(String ma) {
//        this.ma = ma;
//    }
//
//    public String getTen() {
//        return ten;
//    }
//
//    public void setTen(String ten) {
//        this.ten = ten;
//    }
//
//    public String getNhaXB() {
//        return nhaXB;
//    }
//
//    public void setNhaXB(String nhaXB) {
//        this.nhaXB = nhaXB;
//    }
//
//    public double getGia() {
//        return gia;
//    }
//
//    public void setGia(double gia) {
//        this.gia = gia;
//    }
//
//    public int getsMa() {
//        return sMa;
//    }
//
//    public void setsMa(int sMa) {
//        this.sMa = sMa;
//    }
//    
//}
//interface ISach{
//    double getGiaBan();
//}
//class SachGiaoKhoa extends Sach implements ISach{
//    private int lop;
//
//    public SachGiaoKhoa() {
//        
//    }
//
//    @Override
//    public double getGiaBan() {
//        if(lop<=5){
//            return getGia()*80/100;
//        }
//        if(lop<=9){
//            return getGia()*90/100;
//        }
//        return getGia();
//    }
//    public void nhap(Scanner sc){
//        sMa++;
//  
//        
//        setTen(sc.nextLine());
//        setNhaXB(sc.nextLine());
//        
//        String[] ok=getNhaXB().split("\\s+");
//        String res="";
//        for(String i:ok){
//            res+=i.charAt(0)+"";
//        }
//        String tmp=res+String.format("%03d", sMa);
//        setMa(tmp.toUpperCase());
//        
//        setGia(Double.parseDouble(sc.nextLine()));
//        this.lop=Integer.parseInt(sc.nextLine());
//        
//    }
//
//    @Override
//    public String toString() {
//        return getMa()+" "+getTen()+" "+getNhaXB()+" "+lop+" "+Math.round(getGiaBan());
//    }
//    
//}