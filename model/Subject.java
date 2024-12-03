/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chien
 */
public class Subject implements Comparable<Subject>{
    private String mmh;
    public String name;
    private int stc;

    public Subject(String mmh, String name, int stc) {
        this.mmh = mmh;
        this.name = name;
        this.stc = stc;
    }

    public String getMmh() {
        return mmh;
    }

    public void setMmh(String mmh) {
        this.mmh = mmh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStc() {
        return stc;
    }

    public void setStc(int stc) {
        this.stc = stc;
    }
    @Override
    public int compareTo(Subject other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return mmh + " " + name + " " + stc;
    }
    
}
