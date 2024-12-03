/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chien
 */
public class Phong implements Comparable<Phong>{
    private char kihieu;
    private String name;
    private long dongia;
    private double phi;

    public Phong(char kihieu, String name, long dongia, double phi) {
        this.kihieu = kihieu;
        this.name = name;
        this.dongia = dongia;
        this.phi = phi;
    }

    public char getKihieu() {
        return kihieu;
    }

    public void setKihieu(char kihieu) {
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
    public int compareTo(Phong other) {
        return this.name.compareTo(other.name);
    }
    @Override
    public String toString() {
        return kihieu + " " + name + " " + dongia + " " + phi;
    }
    
    
}
