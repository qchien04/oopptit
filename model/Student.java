/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chien
 */
public class Student {
    private String name;
    private String birth;
    private double d1,d2,d3;

    public Student(String name, String birth, double d1, double d2, double d3) {
        this.name = name;
        this.birth = birth;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }

    @Override
    public String toString() {
        String dtb=String.format("%.1f",d1+d2+d3);
        return name +" "+birth+" "+ dtb;
    }
    
}
