/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author chien
 */
public class tre_nhat_gia_nhat {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<ob> arr=new ArrayList<>();
        while(t-->0){
            String[] s=sc.nextLine().split("\\s+");
            String name=s[0];
            String d=s[1];
            SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
            arr.add(new ob(name,df.parse(d)));
        }
        Collections.sort(arr);
        System.out.println(arr.get(arr.size()-1));
        System.out.println(arr.get(0));
    }
}
class ob implements Comparable<ob>{
   private String name;
   private Date date;

    public ob(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(ob o) {
        return date.compareTo(o.date);
    }
    
    
   
}
