/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author chien
 */
public class word_set {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WordSet s1 = new WordSet(in.nextLine());
        WordSet s2 = new WordSet(in.nextLine());
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}
class WordSet{
    private Set<String> se;

    public WordSet(String s) {
        se=new TreeSet<>();
        String[] a=s.toLowerCase().split("\\s+");
        for(String i:a){
            se.add(i);
        }
    }
    public String union(WordSet s2){
        String ans="";
        Set<String>s1=new TreeSet<>(se);
        s1.addAll(s2.se);
        for(String i:s1){
            ans+=(i+" ");
        }
        return ans;
    }
    public String intersection(WordSet s2){
        String ans="";
        Set<String>s1=new TreeSet<>(se);
        s1.retainAll(s2.se);
        for(String i:s1){
            ans+=(i+" ");
        }
        return ans;
    }
    
}