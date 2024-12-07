/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chien
 */
import java.util.*;
public class duaxedap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<TS> arr=new ArrayList<>();
        while(t-->0){
            String name=sc.nextLine();
            String tinh=sc.nextLine();
            String time=sc.nextLine();
            
            arr.add(new TS(name, tinh, time));
            
        }
        Collections.sort(arr);
        for(TS i:arr){
            System.out.println(i);
        }
                
    }
}

class TS implements Comparable<TS>{
    private String id,name,tinh,time;

    public TS(String name, String tinh, String time) {
        String[] a=name.split("\\s+");
        String[] b=tinh.split("\\s+");
        String id="";
        for(String i:b){
            id+=(i.charAt(0)+"").toUpperCase();
        }
        for(String i:a){
            id+=(i.charAt(0)+"").toUpperCase();
        }
        this.id = id;
        this.name = name;
        this.tinh = tinh;
        this.time = time;
    }
    private double getvt(){
        String[] t=time.split(":");
        double thoigian=Double.parseDouble(t[0])-6+Double.parseDouble(t[1])/60;
        return 120/thoigian;
        
    }

    @Override
    public String toString() {
        return id+" "+name+" "+tinh+" "+Math.round(getvt())+" Km/h";
    }

    @Override
    public int compareTo(TS o) {
        return Double.compare(o.getvt(), getvt());
    }
    
    
}