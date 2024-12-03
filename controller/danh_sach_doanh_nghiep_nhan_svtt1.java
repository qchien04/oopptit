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
public class danh_sach_doanh_nghiep_nhan_svtt1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<DoanhNghiep> arr=new ArrayList<>();
        while(n-->0){
            String mdn=sc.nextLine();
            String name=sc.nextLine();
            int sl=Integer.parseInt(sc.nextLine());
            arr.add(new DoanhNghiep(name, mdn, sl));
            
        }
        Collections.sort(arr);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.println("DANH SACH DOANH NGHIEP NHAN TU "+a+" DEN "+b+" SINH VIEN:");
            for(DoanhNghiep i:arr){
                if(a<=i.getSl()&& i.getSl()<=b){
                    System.out.println(i);
                }
                
            }
        }
        
    }
}
class DoanhNghiep implements Comparable<DoanhNghiep>{
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
        if(this.sl!=other.sl){
            return Integer.compare(other.sl, this.sl);
        }
        return this.mdn.compareTo(other.mdn);
    }
    
    @Override
    public String toString() {
        return mdn + " " + name + " " + sl;
    }
    
}

