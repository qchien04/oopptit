/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chien
 */
public class Customer {
    private static int stt;
    private String mkh;
    private String name;
    private String maPhong;
    private String ngayDen;
    private String ngayDi;
    private int songayluutru;
    public Customer(String name, String maPhong, String ngayDen, String ngayDi) {
        this.name = name;
        this.maPhong = maPhong;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        stt++;
        String ma=stt+"";
        while(ma.length()<2){
            ma="0"+ma;
        }
        ma="KH"+ma;
        this.mkh=ma;
        StringBuilder sb = new StringBuilder(ngayDen);
        if (sb.charAt(1) == '/') {
            sb.insert(0, '0');
        }
        int ngaydenint=Integer.parseInt(sb.toString().substring(0, 2));
        sb = new StringBuilder(ngayDi);
        if (sb.charAt(1) == '/') {
            sb.insert(0, '0');
        }
        int ngaydiint=Integer.parseInt(sb.toString().substring(0, 2));
        this.songayluutru=ngaydiint-ngaydenint;
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

    public String getNgayDen() {
        return ngayDen;
    }

    public void setNgayDen(String ngayDen) {
        this.ngayDen = ngayDen;
    }

    public String getNgayDi() {
        return ngayDi;
    }

    public void setNgayDi(String ngayDi) {
        this.ngayDi = ngayDi;
    }

    @Override
    public String toString() {
        return mkh + " " + name + " " + maPhong + " " +songayluutru;
    }
    
    
}
