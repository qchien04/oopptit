/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package ok;
/**
 *
 * @author chien
 */
import java.text.DecimalFormat;
import java.util.*;
public class xacdinhdanhsachtrungtuyen {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<TS> arr=new ArrayList<>();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            double d1=Double.parseDouble(sc.nextLine());
            double d2=Double.parseDouble(sc.nextLine());
            double d3=Double.parseDouble(sc.nextLine());
            arr.add(new TS(id, name, d1, d2, d3));
            
            
        }
        Collections.sort(arr);
        int sl=Integer.parseInt(sc.nextLine());
        for(TS i:arr){
            sl--;
            if(sl==0){
                TS.diemchuan=i.getdiem();
                break;
            }
        }
        System.out.println(String.format("%.1f", TS.diemchuan));
        for(TS i:arr){
            System.out.println(i);
        }
        
    }
}
class TS implements Comparable<TS>{
    private String id,name;
    private double d1,d2,d3;
    public static double diemchuan=0;
    public TS(String id, String name, double d1, double d2, double d3) {
        this.id = id;
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    private double getut(){
        char c=id.charAt(2);
        if(c=='1') return 0.5;
        if(c=='2') return 1;
        return 2.5;
    }
    
    public double getdiem(){
        return d1*2+d2+d3+getut();
    }
    private String getxl(){
        return getdiem()>=diemchuan?"TRUNG TUYEN":"TRUOT";
    }
    
    @Override
    public String toString() {
        DecimalFormat df=new DecimalFormat("#.#");
        return id+" "+name+" "+df.format(getut())+" "+df.format(getdiem())+" "+getxl();
    }

    @Override
    public int compareTo(TS o) {
        return Double.compare(o.getdiem(), getdiem());
    }
    
    
    
    
}