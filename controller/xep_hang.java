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
public class xep_hang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        
        ArrayList<TimeCustom> arr=new ArrayList<>();
        while(n-->0){
            String[] s=sc.nextLine().split("\\s+");
            arr.add( new TimeCustom(Integer.parseInt(s[0]),Integer.parseInt(s[1]) ) );
        }
        Collections.sort(arr, (TimeCustom a, TimeCustom b) -> {
            //if(b.getWaitTime()!=a.getWaitTime()) return Integer.compare(a.getWaitTime(), b.getWaitTime());
            return Integer.compare(a.getStartTime(), b.getStartTime());
        });
        int st=0;
        for(int i=0;i<arr.size();i++){
            TimeCustom t=arr.get(i);
            if(t.getStartTime()>=st){
                st=t.getStartTime()+t.getWaitTime();
            }
            else{
                st=st+t.getWaitTime();
            }
        }
        System.out.println(st);
       
   }
}
class TimeCustom{
    private int startTime;
    private int waitTime;

    public TimeCustom(int startTime, int waitTime) {
        this.startTime = startTime;
        this.waitTime = waitTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }
    
}