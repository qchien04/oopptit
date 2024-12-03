///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.Scanner;
//import java.util.Set;
//import java.util.TreeSet;
//
///**
// *
// * @author chien
// */
//public class hopvagiaocua2filevanban {
//    public static void main(String[] args) throws IOException {
//        WordSet s1 = new WordSet("DATA1.in");
//        WordSet s2 = new WordSet("DATA2.in");
//        System.out.println(s1.union(s2));
//        System.out.println(s1.intersection(s2));
//    }
//}
//class WordSet{
//    private String fname;
//    private Set<String> se;
//    public WordSet(String fname) throws FileNotFoundException {
//        this.fname = fname;
//        Scanner sc=new Scanner(new File(fname));
//        se=new TreeSet<>();
//        while(sc.hasNextLine()){
//            String s[]=sc.nextLine().trim().split("\\s+");
//            for(String i:s){
//                se.add(i.toLowerCase());
//            }
//        }
//    }
//    public String union(WordSet s2){
//        Set<String> se1=new TreeSet<>(se);
//        String ans="";
//        se1.addAll(s2.se);
//        for(String i:se1){
//            ans+=i+" ";
//        }
//        return ans;
//    }
//    public String intersection(WordSet s2){
//        Set<String> se1=new TreeSet<>(se);
//        se1.retainAll(s2.se);
//        String ans="";
//        for(String i:se1){
//            ans+=i+" ";
//        }
//        return ans;
//    }
//    
//}
