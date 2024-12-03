/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chien
 */
public class Product {
    private static int stt=0;
    private String ma;
    private String name;
    private String group;
    private double giamua;
    private double giaban;

    public Product(String name, String group, double giamua, double giaban) {
        stt++;
        this.ma = String.format("MH%02d", stt);
        this.name = name;
        this.group = group;
        this.giamua = giamua;
        this.giaban = giaban;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getGiamua() {
        return giamua;
    }

    public void setGiamua(double giamua) {
        this.giamua = giamua;
    }

    public double getGiaban() {
        return giaban;
    }

    public void setGiaban(double giaban) {
        this.giaban = giaban;
    }
    

    @Override
    public String toString() {
        return ma+" "+name+" "+group+" "+String.format("%.2f", (giaban-giamua));
    }
    
}
