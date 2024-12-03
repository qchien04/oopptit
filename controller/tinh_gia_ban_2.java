/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.*;
/**
 *
 * @author chien
 */
public class tinh_gia_ban_2 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Product> arr=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String dv=sc.nextLine();
            long giamua=Integer.parseInt(sc.nextLine());
            long quantity=Integer.parseInt(sc.nextLine());
            Product a=new Product(name, dv, giamua, quantity);
            arr.add(a);
        }
        Collections.sort(arr);
        for(Product i:arr){
            System.out.println(i);
        }
    }
}
class Product implements Comparable<Product>{
    private static int stt=0;
    private String ma;
    private String name;
    private String donvi;
    private long giamua;
    private long quantity;

    public Product(String name, String donvi, long giamua, long quantity) {
        stt++;
        this.ma = String.format("MH%02d", stt);
        this.name = name;
        this.donvi = donvi;
        this.giamua = giamua;
        this.quantity = quantity;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getGiamua() {
        return giamua;
    }

    private long phivanchuyen(){
        int a=Math.round(giamua*quantity*5/100);
        return a;
    }
    public long thanhtien(){
        long a=Math.round(giamua*quantity+phivanchuyen());
        return a;
    }
    public double giaban(){
        return (double)this.thanhtien()*102/100/this.quantity;
    }


    @Override
    public String toString() {
        long a=(long)Math.ceil(this.giaban()/100)*100;
        return this.ma+" "+this.name+" "+this.donvi+" "
                +this.phivanchuyen()+" "+this.thanhtien()+" "
                +a;
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(o.giaban(), this.giaban());
    }
    
}
