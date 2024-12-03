/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 *
 * @author chien
 */
public class danh_sach_ca_thi {
    public static void main(String[] args) {
        try {
            BufferedReader br=new BufferedReader(new FileReader("CATHI.in"));
            int t=Integer.parseInt(br.readLine());
            ArrayList<Test> arr=new ArrayList<>();
            while(t-->0){
                String date=br.readLine();
                String time=br.readLine();
                String room=br.readLine();
                arr.add(new Test(date, time, room));
                
            }
            Collections.sort(arr,new Comparator<Test>(){
                @Override
                public int compare(Test a,Test b){
                    return a.getRealtime().compareTo(b.getRealtime());
                }
            });
            for(Test i: arr){
                System.out.println(i);
            }
        } catch (Exception e) {
        }
    }
}
class Test{
    private static int stt=0;
    private String ma;
    private String date;
    private String time;
    private String room;
    private Date realtime;

    public Test(String date, String time, String room){
        stt++;
        this.ma = String.format("C%03d", stt);
        this.date = date;
        this.time = time;
        this.room = room;
        String c=date+" "+time;
        SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy HH:mm");
        try {
            this.realtime=formatter.parse(c); 
        } catch (Exception e) {
            System.out.println("loi");
        }
    }   

    public String getDate() {
        return date;
    }

    public Date getRealtime() {
        return realtime;
    }
    
    @Override
    public String toString() {
        return ma+" "+date+" "+time+" "+room;
    }
    
}
