/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author chien
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class hieucuahaitaptu {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.difference(s2));
        System.out.println(s2.difference(s1));
    }
}
class WordSet{
    private Set<String> se;

    public WordSet(String fn) throws FileNotFoundException {
        Scanner sc=new Scanner(new File(fn));
        se=new TreeSet<>();
        while(sc.hasNext()){
            se.add(sc.next().toLowerCase());
        }
        
    }
    public String difference(WordSet s2){
        Set<String> se1=new TreeSet<>(se);
        se1.removeAll(s2.se);
        String ans="";
        for(String i:se1){
            ans+=i+" ";
        }
        return ans;
    }
    
}
