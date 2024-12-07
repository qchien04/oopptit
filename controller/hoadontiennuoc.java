/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author chien
 */
import java.util.*;
public class hoadontiennuoc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<HD> arr=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            long c1=Long.parseLong(sc.nextLine());
            long c2=Long.parseLong(sc.nextLine());
            arr.add(new HD(name, c1, c2));
        }
        Collections.sort(arr);
        for(HD i:arr){
            System.out.println(i);
        }
    }
}
class HD implements Comparable<HD>{
    private static int stt=0;
    private String id, name;
    private long c1,c2;

    public HD(String name, long c1, long c2) {
        this.id=String.format("KH%02d", ++stt);
        this.name = name;
        this.c1 = c1;
        this.c2 = c2;
    }
    
    private int getpcpp(){
        long sk=c2-c1;
        if(sk>100) return 5;
        if(sk>50) return 3;
        return 2;
    }
    private long tong(){
        long sk=c2-c1;
        if(sk<=50){
            return sk*100;
        }
        if(sk<=100){
            return 50*100+(sk-50)*150;
        }
        return 50*100+50*150+(sk-100)*200;
    }
    private double gettt(){
        return tong()+(getpcpp()*tong()/100.0);
    }
    @Override
    public String toString() {
        return id+" "+name+" "+Math.round(gettt());
    }

    @Override
    public int compareTo(HD o) {
        return Double.compare(o.gettt(), gettt());
        }
    
}