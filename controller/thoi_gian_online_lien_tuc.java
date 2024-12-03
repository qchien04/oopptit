/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author chien
 */
public class thoi_gian_online_lien_tuc {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new FileReader("ONLINE.in"));
            int t=Integer.parseInt(br.readLine());
            SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            ArrayList<SV> a=new ArrayList<>();
            while(t-->0){
                String name=br.readLine();
                Date start=f.parse(br.readLine());
                Date end=f.parse(br.readLine());
                a.add(new SV(name, start, end));
            }
            Collections.sort(a,new Comparator<SV>(){
                @Override
                public int compare(SV o1, SV o2) {
                    return Long.compare(o2.getTotal(), o1.getTotal());
                }
                
            });
            for(SV i:a){
                System.out.println(i);
            }
        } catch (Exception e) {
        }
    }
}
class SV{
    private String name;
    private Date start;
    private Date end;
    private long total;

    public SV(String name, Date start, Date end) {
        String n[] = name.trim().split("\\s+");
        String rname = "";
        for (String i : n) {
            rname = rname + i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        this.name = name;
        this.start = start;
        this.end = end;
        this.total=(end.getTime()-start.getTime())/(1000L*60);
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return name + " "+ total;
    }
    
}