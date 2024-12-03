/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author chien
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class doc_file_van_ban {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s=sc.nextLine();
            if(s.equals("END")){
                break;
            }
            String n[] = s.trim().split("\\s+");
            String rname = "";
            for (String i : n) {
                rname = rname + i.substring(0, 1).toUpperCase() + i.substring(1).toLowerCase() + " ";
            }
            System.out.println(rname);
        }
    }
}