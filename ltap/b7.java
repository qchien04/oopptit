/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ltap;

import java.util.Scanner;

/**
 *
 * @author chien
 */
public class b7 {
    private static long count(String a,String b){
        if(a.length()!=b.length()) return -1;
        if(a.equals(b)) return 0;
        for(int i=0;i<a.length();i++){
            b=b.substring(1)+(b.charAt(0)+"");
            if(a.equals(b)){
                return i+1;
            }
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String[] s=new String[t];
        for(int i=0;i<t;i++){
            s[i]=sc.next();
        }
        long ans=100000000;
        boolean a=false;
        for(String i:s){
            long cnt=0;
            for(String j:s){
                long check=count(i, j);
                if(check==-1){
                    a=true;
                    break;
                }else{
                    cnt+=check;
                }
                
            }
            if(a) break;
            ans=Math.min(ans,cnt);
        }
        if(a) System.out.println(-1);
        else{
            System.out.println(ans);
        }
    }
}
