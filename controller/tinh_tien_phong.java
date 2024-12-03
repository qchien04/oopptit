/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author chien
 */
public class tinh_tien_phong {

    public static void main(String[] args) throws ParseException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("KHACHHANG.in"));
            int t = Integer.parseInt(br.readLine());
            ArrayList<Customer> arr = new ArrayList<>();
            for (int i = 1; i <= t; i++) {
                String name = br.readLine();
                String maPhong = br.readLine();
                DateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
                Date ngayDen = dateformat.parse(br.readLine());
                Date ngayDi = dateformat.parse(br.readLine());
                long phatsinh=Long.parseLong(br.readLine());
                Customer st = new Customer(name, maPhong, ngayDen, ngayDi,phatsinh);
                arr.add(st);
            }
            Collections.sort(arr, (Customer a, Customer b) -> Long.compare(b.getThanhtien(), a.getThanhtien()));
            for (Customer i : arr) {
                System.out.println(i);
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println(e);
        }

    }
}

class Customer {

    private static int stt;
    private String mkh;
    private String name;
    private String maPhong;
    private Date ngayDen;
    private Date ngayDi;
    private long ngayo;
    private long phatsinh;
    private long thanhtien;

    public Customer(String name, String maPhong, Date ngayDen, Date ngayDi, long phatsinh) {
        String n[] = name.trim().split("\\s+");
        String rname = "";
        for (String i : n) {
            rname = rname + i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        this.name = rname;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        this.phatsinh = phatsinh;
        stt++;
        String ma = stt + "";
        while (ma.length() < 2) {
            ma = "0" + ma;
        }
        ma = "KH" + ma;
        this.mkh = ma;
        long songayluutru = ( ngayDi.getTime()-ngayDen.getTime() )/(1000L * 24 * 60 * 60)+1;
        this.thanhtien=songayluutru*tang(this.maPhong)+this.phatsinh;
        this.ngayo=songayluutru;
    }

    private int tang(String n) {
        switch (n.charAt(0)) {
            case '1':
                return 25;
            case '2':
                return 34;
            case '3':
                return 50;
            case '4':
                return 80;
            default:
                throw new AssertionError();
        }
    }

    public static int getStt() {
        return stt;
    }

    public static void setStt(int stt) {
        Customer.stt = stt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMkh() {
        return mkh;
    }

    public long getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(long thanhtien) {
        this.thanhtien = thanhtien;
    }


    @Override
    public String toString() {
        return mkh + " " + name + maPhong + " " + ngayo+" "+thanhtien;
    }

}
