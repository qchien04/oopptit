/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author chien
 */
public class ten_viet_tat {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("DANHSACH.in"));
            int t = Integer.parseInt(br.readLine());
            ArrayList<Sname> a = new ArrayList<>();
            while (t-- > 0) {
                String name = br.readLine().trim();
                a.add(new Sname(name));
            }
            int q=Integer.parseInt(br.readLine());
            while(q-->0){
                ArrayList<Sname> ans = new ArrayList<>();
                String r=br.readLine();
                r=r.replace(".", "\\.").replace("*", "\\w");
                for (Sname i : a) {
                    if(i.getSname().matches(r)){
                        ans.add(i);
                    }
                }
                Collections.sort(ans);
                for (Sname i : ans) {
                    System.out.println(i);
                }
            }

            
            
//            for (Sname i : a) {
//                System.out.println(i.getSname());
//            }

        } catch (Exception e) {
        }
    }

}

class Sname implements Comparable<Sname> {

    private Name name;
    private String sname;

    public Sname(String name) {
        this.name = new Name(name);
        String[] n = name.split("\\s+");
        String s = "";
        for (String i : n) {
            s = s + i.charAt(0) + ".";
        }
        this.sname = s.substring(0,s.length()-1);
    }

    public String getSname() {
        return sname;
    }

    @Override
    public String toString() {
        return name + "";
    }

    @Override
    public int compareTo(Sname o) {
        return this.name.compareTo(o.name);
    }
}

class Name implements Comparable<Name> {

    private String name;
    private String fname;
    private String lname;
    private String mname;

    public Name(String name) {
        String n[] = name.trim().split("\\s+");
        String rname = "";
        for (String i : n) {
            rname = rname + i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
        }
        n = rname.split("\\s+");
        this.name = rname;
        this.fname = n[0];
        this.lname = n[n.length - 1];
        String tmp = "";
        for (int i = 1; i < n.length - 1; i++) {
            tmp += n[i];
        }
        this.mname = tmp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Name o = (Name) obj;
        return this.name.equals(o.name);
    }

    @Override
    public int compareTo(Name other) {
        if (!this.lname.equals(other.lname)) {
            return this.lname.compareTo(other.lname);
        }
        return this.fname.compareTo(other.fname);

    }

    @Override
    public String toString() {
        return name;
    }

}
