/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnBaToCom;

/**
 *
 * @author chien
 */
import java.util.*;
public class chuanhoacau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ans="";
        while(sc.hasNextLine()){
            String s[]=sc.nextLine().trim().toLowerCase().split("\\s+");
            if(s[0].equals("end")) break;
            s[0]=s[0].substring(0,1).toUpperCase()+s[0].substring(1).toLowerCase();
            ans+=String.join(" ", s);
            char c=ans.charAt(ans.length()-1);
            if(c=='!'||c=='?'||c=='.'){
                if(ans.charAt(ans.length()-2)==' '){
                    ans=ans.substring(0,ans.length()-2)+c;
                }
                ans+="\n";
            }
            else ans+=".\n";
            
        }
        System.out.println(ans);
    }
}
