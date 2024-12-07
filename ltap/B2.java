/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ltap;

/**
 *
 * @author chien
 */
import java.util.*;
public class B2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
            Map<Character,Integer> mp=new TreeMap<>();
            for(int i=0;i<s.length();i++){
                if(mp.containsKey(s.charAt(i))){
                    mp.put(s.charAt(i), mp.get(s.charAt(i))+1);
                }
                else{
                    mp.put(s.charAt(i),1);
                }
            }
            String res="";
            int sum=0;
            for(char i:mp.keySet()){
                if(i<='9'&&i>='0'){
                    int sl=mp.get(i);
                    while(sl-->0){
                        sum+=Integer.parseInt(i+"");
                    }
                   
                }
                else{
                    int sl=mp.get(i);
                    while(sl-->0){
                        res+=i+"";
                    }
                }
                
            }
            System.out.println(res+sum);
        }
    }
}
