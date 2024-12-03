/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author chien
 */
import java.util.*;
public class day_ngoac_dung_dai_nhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s=sc.nextLine();
//            Deque<Character> dq=new ArrayDeque<>();
//            int ans=0; wrong solution
//            int cnt=0;
//            for(int i=0;i<s.length();i++){
//                char c=s.charAt(i);
//                if(c=='('){
//                    dq.addFirst(c);
//                }
//                else{
//                    if(!dq.isEmpty()){
//                        cnt+=1;
//                        ans=Math.max(ans, cnt);
//                        dq.pollFirst();
//                    }
//                    else{
//                       cnt=0;
//                    }
//                }
//            }
//            System.out.println(ans*2);
            Deque<Integer> dq=new ArrayDeque<>();
            dq.addFirst(-1);
            int ans=0;
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c=='('){
                    dq.addFirst(i);
                }
                else{
                    int head=dq.pollFirst();
                    if(dq.isEmpty()){
                        dq.addFirst(i);
                    }
                    else ans=Math.max(ans,i-dq.peekFirst());
                }
            }
            System.out.println(ans);
        }
    }
}
