/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.util.*;
/**
 *
 * @author chien
 */
public class danh_sach_thuc_tap_1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<Intern> arr=new ArrayList<>();
        while(t-->0){
            String id=sc.nextLine();
            String name=sc.nextLine();
            String cl=sc.nextLine();
            String email=sc.nextLine();
            String bs=sc.nextLine();
            arr.add(new Intern(id, name, cl, email, bs));
            
        }
        Collections.sort(arr);
        int n=Integer.parseInt(sc.nextLine());
        while(n-->0){
            String s=sc.nextLine();
            for(Intern i: arr){
                if(i.getBs().equals(s)){
                    System.out.println(i);
                }
            }
        }
    }
}
class Intern implements Comparable<Intern>{
    private static int stt=0;
    private int s=0;
    private String id,name,cl,email,bs;

    public Intern(String id, String name, String cl, String email, String bs) {
        stt++;
        this.s = stt;
        this.id = id;
        this.name = name;
        this.cl = cl;
        this.email = email;
        this.bs = bs;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
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

    public String getCl() {
        return cl;
    }

    public void setCl(String cl) {
        this.cl = cl;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBs() {
        return bs;
    }

    public void setBs(String bs) {
        this.bs = bs;
    }

    @Override
    public String toString() {
        return s+" "+id+" "+name+" "+cl+" "+email+" "+bs;
    }

    @Override
    public int compareTo(Intern o) {
        return id.compareTo(o.id);
    }
    
}
