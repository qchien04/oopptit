/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javatuhoc;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class JavaTuHoc {

    public static class sinhVien implements Comparable<sinhVien> {

        private String ma, ten, trangThai;
        private Float diemUT, diemXT, t, l, h;

        public sinhVien(String ma, String ten, Float t, Float l, Float h, Float diemUT) {
            this.ma = ma;
            this.ten = ten;
            this.diemUT = diemUT;
            this.t = t;
            this.l = l;
            this.h = h;
            this.diemXT = this.t * 2 + this.l + this.h + this.diemUT;
        }

        public sinhVien(String ma, String ten, Float t, Float l, Float h, Float diemUT, String trangThai) {
            this.ma = ma;
            this.ten = ten;
            this.t = t;
            this.l = l;
            this.h = h;
            this.diemUT = diemUT;
            this.diemXT = this.t * 2 + this.l + this.h + this.diemUT;
            this.trangThai = trangThai;
        }

        public void setTrangThai(String trangThai) {
            this.trangThai = trangThai;
        }

        public String getTrangThai() {
            return trangThai;
        }

        public Float getDiemXT() {
            return diemXT;
        }

        public void setDiemXT(Float diemXT) {
            this.diemXT = diemXT;
        }

        public String chuanHoaTen(String s) {
            s = s.trim();
            StringBuilder sb = new StringBuilder();
            String[] word = s.split("\\s++");
            for (String x : word) {
                x = x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase();
                sb.append(x).append(" ");
            }
            return sb.toString().trim();
        }

        @Override
        public int compareTo(sinhVien o) {
            if (this.diemXT != o.diemXT) {
                return Double.compare(o.diemXT, this.diemXT); 
            }
            return this.ma.compareTo(o.ma); 
        }

        public String toString() {
            DecimalFormat df=new DecimalFormat("#.#");
            return this.ma + " " + chuanHoaTen(this.ten) + " " + df.format(diemUT) + " " 
                    + df.format(diemXT) + " " + this.trangThai;
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("THISINH.in"));
        List<sinhVien> list = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String ma = sc.nextLine();
            String x = ma.substring(0, 3);
            float diemUT = 0;
            if (x.equals("KV1")) {
                diemUT += 0.5;
            } else if (x.equals("KV2")) {
                diemUT += 1.0;
            } else if (x.equals("KV3")) {
                diemUT += 2.5;
            }
            String ten = sc.nextLine();
            float toan = Float.parseFloat(sc.nextLine());
            float ly = Float.parseFloat(sc.nextLine());
            float hoa = Float.parseFloat(sc.nextLine());
            list.add(new sinhVien(ma, ten, toan, ly, hoa, diemUT));
        }
        Collections.sort(list);
        int soTT = sc.nextInt();
        float diemTT = 0;
        for (sinhVien x : list) {
            if (soTT > 0) {
                x.setTrangThai("TRUNG TUYEN");
                soTT -= 1;
                diemTT = x.getDiemXT();
            }
            else if (soTT == 0 && x.getDiemXT() == diemTT) {
                x.setTrangThai("TRUNG TUYEN");
            } else {
                x.setTrangThai("TRUOT");
            }
        }
        System.out.println(String.format("%.1f", diemTT));
        for (sinhVien x : list) {
            System.out.println(x);
        }
    }
}

