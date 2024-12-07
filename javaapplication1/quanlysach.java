/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author chien
 */
public class quanlysach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        QLSach q=new QLSach();
        for (int i = 0; i < 4; i++) {
            q.nhap(in);
        }
        q.maxGiaTheoNXB();
    }
}
class Sach{
    private String ma;
    private String ten;
    private String nhaXB;
    protected double gia;
    private String id;

    public Sach() {
    }

    public Sach(String ma, String ten, String nhaXB, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.nhaXB = nhaXB;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public void setNhaXB(String nhaXB) {
        this.nhaXB = nhaXB;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getId(){
        String[] s=nhaXB.split("\\s+");
        String res="";
        for(String i:s){
            String dau=i.charAt(0)+"";
            res+=dau.toUpperCase()+i.substring(1,i.length()).toLowerCase()+" ";
        }
        String ans=res.substring(0,res.length()-1);
        return ans;
    }

    @Override
    public String toString() {
        return ma+" "+ten+" "+getId()+" "+gia;
    }
    
    
}
class QLSach{
    private List<Sach> a;
    public int sMa=0;
    public QLSach() {
        a=new ArrayList<>();
    }
    public void nhap(Scanner sc){
        
        sMa++;
        Sach sach=new Sach();
        sach.setTen(sc.nextLine());
        sach.setNhaXB(sc.nextLine());

        String[] ok=sach.getNhaXB().split("\\s+");
        String res="";
        for(String i:ok){
            res+=i.charAt(0)+"";
        }
        String tmp=res+String.format("%03d", sMa);
        sach.setMa(tmp.toUpperCase());
        
        sach.setGia(Double.parseDouble(sc.nextLine()));

        a.add(sach);
    }
    public void maxGiaTheoNXB(){
        Map<String, Sach> m = a.stream().collect(
                Collectors.groupingBy(Sach::getId,
                                    Collectors.collectingAndThen(
                                Collectors.reducing((Sach t1, Sach t2)
                                        -> t1.getGia()> t2.getGia()? t1 : t2), 
                                Optional::get)));
        m.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}