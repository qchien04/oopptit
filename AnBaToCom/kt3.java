///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package AnBaToCom;
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
//import java.util.*;
//public class kt3 {
//    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
//        
//        DSNV q=new DSNV();
//        q.doc();
//        q.out();
//        
//       
//    }
//}
//class NhanVien implements Serializable{
//    private int ma;
//    private String hoTen,chucVu;
//    private int soNgay;
//    private long luongcb;
//
//    private double getphucap(String s){
//        if(s.equals("GD")) return 250000;
//        if(s.equals("PGD")) return 200000;
//        if(s.equals("TP")) return 180000;
//        return 150000;
//    }
//    private double getthunhap(int songay){
//        double pc=getphucap(this.chucVu);
//        double x=this.luongcb*songay;
//        if(songay>=25){
//            x=x*120/100;
//        }
//        else if(x>=22){
//            x=x*110/100;
//        }
//        return x+getphucap(this.chucVu);
//    }
//    public String chuanhoa(String hoten){
//        Scanner sc=new Scanner(hoten);
//        String s="";
//        while(sc.hasNext()){
//            String x=sc.next();
//            x=x.toLowerCase();
//            x=(char)(x.charAt(0)-'a'+'A')+x.substring(1);
//            s+=x+" ";
//            
//        }
//        return s.substring(0,s.length()-1);
//    }
//
//    @Override
//    public String toString() {
//        return ma+" "+hoTen+" "+luongcb*soNgay+" "+getphucap(chucVu)+" "+getthunhap(soNgay);
//    }
//}
//class DSNV{
//    private NhanVien[] a;
//    public DSNV() {
//    }
//    public void doc() throws FileNotFoundException, IOException, ClassNotFoundException{
//        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("NV.in"));
//        NhanVien[] arr=(NhanVien[])ois.readObject();
//        this.a=arr;
//    }
//    public void out(){
//        for(NhanVien i:a){
//            System.out.println(i);
//        }
//    }
//        
//}
