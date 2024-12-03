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
public class ket_qua_xet_tuyen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<KQ> arr=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String bd=sc.nextLine();
            double d1=Double.parseDouble(sc.nextLine());
            double d2=Double.parseDouble(sc.nextLine());
            arr.add(new KQ(name, bd, d1, d2));
            
        }
        
        Collections.sort(arr, (KQ o1, KQ o2) -> {
            if(o1.getTotal()!=o2.getTotal())
                return -Long.compare(o1.getTotal(), o2.getTotal());
            return o1.id.compareTo(o2.id);
        });
        for(KQ i:arr){
            System.out.println(i);
        }
    }
    
}
class KQ{
    private static int stt=1;
    public String id,name;
    private double d1,d2;
    private int tuoi;

    public KQ(String name,String bd, double d1, double d2) {
        this.id = "PH"+String.format("%02d", stt++);
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.tuoi=2021-Integer.parseInt(bd.split("/")[2]);
    }
    private double getthuong(){
        if(d1>=8 && d2 >=8) return 1;
        if(d1>=7.5 && d2 >=7.5) return 0.5;
        return 0;
    }
    private String getXL(long t){
        if(t>=9) return "Xuat sac";
        if(t>=8) return "Gioi";
        if(t>=7) return "Kha";
        if(t>=5) return "Trung binh";
        return "Truot";
    }
    public long getTotal(){
        long x=Math.round((d1+d2)/2+getthuong());
        return x<=10?x:10;
    }
    @Override
    public String toString() {
        long x=getTotal();
        return id+" "+name+" "+tuoi+" "+getTotal()+" "+getXL(getTotal());
    }

//    @Override
//    public int compareTo(KQ o) {
//        if(getTotal()!=o.getTotal())
//            return -Long.compare(getTotal(), o.getTotal());
//        return id.compareTo(o.id);
//    }
//    
    
    
}