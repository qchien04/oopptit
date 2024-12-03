/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chien
 */
public class DoanhNghiep implements Comparable<DoanhNghiep>{
    private String name;
    private String mdn;
    private int sl;

    public DoanhNghiep(String name, String mdn, int sl) {
        this.name = name;
        this.mdn = mdn;
        this.sl = sl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMdn() {
        return mdn;
    }

    public void setMdn(String mdn) {
        this.mdn = mdn;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }
    
    @Override
    public int compareTo(DoanhNghiep other) {
        return this.mdn.compareTo(other.mdn);
    }
    
    @Override
    public String toString() {
        return mdn + " " + name + " " + sl;
    }
    
}
