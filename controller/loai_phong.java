/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class loai_phong {
    public static void main(String[] args) throws IOException {
        ArrayList<LoaiPhong> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("PHONG.in"));
        int n = Integer.parseInt(in.nextLine());
        while(n-->0){
            ds.add(new LoaiPhong(in.nextLine()));
        }
        Collections.sort(ds);
        for(LoaiPhong tmp : ds){
            System.out.println(tmp);
        }
    }
}
class LoaiPhong implements Comparable<LoaiPhong>{
    private String kihieu;
    private String name;
    private long dongia;
    private double phi;

    public LoaiPhong(String s) {
        String arr[]=s.trim().split("\\s+");
        this.kihieu = arr[0];
        this.name = arr[1];
        this.dongia = Long.parseLong(arr[2]);
        this.phi = Double.parseDouble(arr[3]);
    }

    public String getKihieu() {
        return kihieu;
    }

    public void setKihieu(String kihieu) {
        this.kihieu = kihieu;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDongia() {
        return dongia;
    }

    public void setDongia(long dongia) {
        this.dongia = dongia;
    }

    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }
    @Override
    public int compareTo(LoaiPhong other) {
        return this.name.compareTo(other.name);
    }
    @Override
    public String toString() {
        return kihieu + " " + name + " " + dongia + " " + phi;
    }
    
    
}
