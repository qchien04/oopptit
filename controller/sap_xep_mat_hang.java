/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import model.Product;

/**
 *
 * @author chien
 */
public class sap_xep_mat_hang {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new FileReader("MATHANG.in"));
            int t=Integer.parseInt(br.readLine());
            ArrayList<Product> a=new ArrayList<>();
            while(t-->0){
                String name=br.readLine();
                String group=br.readLine();
                double giamua=Double.parseDouble(br.readLine());
                double giaban=Double.parseDouble(br.readLine());
                a.add(new Product(name, group, giamua, giaban));

            }
            Collections.sort(a, (Product a1, Product b) -> Double.compare(b.getGiaban()-b.getGiamua(), a1.getGiaban() - a1.getGiamua()));
            for(Product i: a){
                System.out.println(i);
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }
    }
}
//class Product {
//    private static int stt=0;
//    private String ma;
//    private String name;
//    private String group;
//    private double giamua;
//    private double giaban;
//
//    public Product(String name, String group, double giamua, double giaban) {
//        stt++;
//        this.ma = String.format("MH%02d", stt);
//        this.name = name;
//        this.group = group;
//        this.giamua = giamua;
//        this.giaban = giaban;
//    }
//
//    public String getMa() {
//        return ma;
//    }
//
//    public void setMa(String ma) {
//        this.ma = ma;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getGroup() {
//        return group;
//    }
//
//    public void setGroup(String group) {
//        this.group = group;
//    }
//
//    public double getGiamua() {
//        return giamua;
//    }
//
//    public void setGiamua(double giamua) {
//        this.giamua = giamua;
//    }
//
//    public double getGiaban() {
//        return giaban;
//    }
//
//    public void setGiaban(double giaban) {
//        this.giaban = giaban;
//    }
//    
//
//    @Override
//    public String toString() {
//        return ma+" "+name+" "+group+" "+String.format("%.2f", (giaban-giamua));
//    }
//    
//}
