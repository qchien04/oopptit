/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author chien
 */
public class tong_chu_so {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("DATA.in"));
            ArrayList<String> arr=(ArrayList<String>)ois.readObject();
         
            for(String i: arr){
                ArrayList<Character> ans=new ArrayList<>();
                for(int j=0;j<i.length();j++){
                    char tmp=i.charAt(j);
                    if(tmp<='9'&&tmp>='0'){
                        ans.add(tmp);
                    }
                }
                int sum=0;
                int c=0;
                while(ans.get(c)=='0'){
                    c++;
                }
                for(int h=c;h<ans.size();h++){
                    sum+=(ans.get(h)-'0');
                    System.out.print(ans.get(h));
                }
                System.out.println(" "+sum);
                
            }
            
        } catch (Exception e) {
        }
    }
}
