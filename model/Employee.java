/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chien
 */
public class Employee {
    private String name;
    private String mnv;
    private String gioitinh;
    private String birth;
    private String address;
    private String mst;
    private String ngaykihd;

    public Employee(String name, String gioitinh, String birth, String address, String mst, String ngaykihd) {
        this.name = name;
        this.mnv = "00001";
        this.gioitinh = gioitinh;
        this.birth = birth;
        this.address = address;
        this.mst = mst;
        this.ngaykihd = ngaykihd;
    }

    

    @Override
    public String toString() {
        return mnv+" "+name+" "+gioitinh+" "+birth+" "+address+" "+mst+" "+ngaykihd;
    }
}
