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
public class tinhtien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<sp> arr=new ArrayList<>();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            long sl=Long.parseLong(sc.nextLine());
            long gia=Long.parseLong(sc.nextLine());
            long ck=Long.parseLong(sc.nextLine());
            arr.add(new sp(id, name, sl, gia, ck));
        }
        Collections.sort(arr);
        for(sp i:arr){
            System.out.println(i);
        }
    }
}
class sp implements Comparable<sp>{
    private String id,name;
    private long sl,gia,ck;

    public sp(String id, String name, long sl, long gia, long ck) {
        this.id = id;
        this.name = name;
        this.sl = sl;
        this.gia = gia;
        this.ck = ck;
    }

    @Override
    public String toString() {
        return id+" "+name+" "+sl+ " "+gia+" "+ck+" "+gettt();
    }

    @Override
    public int compareTo(sp o) {
        return Long.compare(o.gettt(), gettt());
    }
    private long gettt(){
        return sl*gia-ck;
    }
    
}