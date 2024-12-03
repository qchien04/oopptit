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
public class clbbongda {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<CLB> arr=new ArrayList<>();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            long giave=Long.parseLong(sc.nextLine());
            arr.add(new CLB(id, name, giave));
        }
        t=Integer.parseInt(sc.nextLine());
        ArrayList<DT> ans=new ArrayList<>();
        while(t-->0){
            String[] a=sc.nextLine().split("\\s+");
            long sl=Long.parseLong(a[1]);
            String team=a[0].substring(1,3);
            for(CLB i:arr){
                if(i.getId().equals(team)){
                    ans.add(new DT(sl*i.getGiave(),a[0],i.getName()));
                    break;
                }
            }
        }
        Collections.sort(ans);
        for(DT i: ans){
            System.out.println(i);
        }
    }
}
class DT implements Comparable<DT>{
    private long doanhthu;
    private String id,dt;

    public DT(long doanhthu, String id, String dt) {
        this.doanhthu = doanhthu;
        this.id = id;
        this.dt = dt;
    }

    @Override
    public String toString() {
        return id+" "+dt+" "+doanhthu;
    }

    @Override
    public int compareTo(DT o) {
        if(o.doanhthu!=doanhthu) return Long.compare(o.doanhthu, doanhthu);
        return dt.compareTo(o.dt);
    }
    
}
class CLB{
    private String id,name;
    private long giave;

    public CLB(String id, String name, long giave) {
        this.id = id;
        this.name = name;
        this.giave = giave;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getGiave() {
        return giave;
    }

    public void setGiave(int giave) {
        this.giave = giave;
    }
    
}