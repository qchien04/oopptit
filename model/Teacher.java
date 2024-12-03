/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chien
 */
public class Teacher {
    private String name;
    private String mgv;
    private long lcb;
    private long pc;
    private int hsl;

    public Teacher(String name, String mgv, long lcb) {
        this.name = name;
        this.mgv = mgv;
        this.lcb = lcb;
        String s=this.mgv.substring(0, 2);
        switch (s) {
            case "HP":
                this.pc=900000;
                break;
            case "HT":
                this.pc=2000000;
                break;
            case "GV":
                this.pc=500000;
                break;
            default:
                throw new AssertionError();
        } 
        this.hsl = hsl;
        String hslgv=this.mgv.substring(2);
        this.hsl=Integer.parseInt(hslgv);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMgv() {
        return mgv;
    }

    public void setMgv(String mgv) {
        this.mgv = mgv;
    }

    public long getLcb() {
        return lcb;
    }

    public void setLcb(long lcb) {
        this.lcb = lcb;
    }

    public int getHsl() {
        return hsl;
    }

    public void setHsl(int hsl) {
        this.hsl = hsl;
    }

    @Override
    public String toString() {
        long total=this.hsl*this.lcb+this.pc;
        return mgv+" "+name+" "+this.hsl+" "+this.pc+" "+total;
    }
    
    
}
