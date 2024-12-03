/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author chien
 */
public class tinh_gio {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Player> a=new ArrayList<>();
        while(t-->0){
            String code=sc.nextLine();
            String name=sc.nextLine();
            String in=sc.nextLine();
            String out=sc.nextLine();
            SimpleDateFormat df=new SimpleDateFormat("hh:mm");
            Player p=new Player(code, name, df.parse(in), df.parse(out));
            a.add(p);
        }
        Collections.sort(a);
        for(Player i: a){
            System.out.println(i);
        }
    }
}
class Player implements Comparable<Player>{
    private String code,name;
    private Date in,out;

    public Player(String code, String name, Date in, Date out) {
        this.code = code;
        this.name = name;
        this.in = in;
        this.out = out;
    }
    private String getTime(){
        long s=(out.getTime()-in.getTime())/(1000L);
        long h=s/3600;
        long m=(s-3600*h)/60;
        return h+" gio "+m+" phut";

    }
    @Override
    public String toString() {
        return code + "  " + name + ' '+getTime();
    }

    @Override
    public int compareTo(Player o) {
        long t1=this.out.getTime()-this.in.getTime();
        long t2=o.out.getTime()-o.in.getTime();
        return Long.compare(t2, t1);
    }
    
}
