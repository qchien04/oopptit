/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author chien
 */
public class loaibo100 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int t=Integer.parseInt(sc.nextLine());
        
        while(t-->0){
            String s=sc.nextLine();
            Stack<pair> st=new Stack<>();
            int max=0;
            int j=0;
            for(char i:s.toCharArray()){
                st.push(new pair(i, j));
                if(st.size()>=3){
                    char dau=st.elementAt(st.size()-2).c;
                    char dau2=st.elementAt(st.size()-3).c;
                    if(i=='0'&&dau=='0'&&dau2=='1'){
                        st.pop();
                        st.pop();
                        st.pop();
                    }
                }
                if(st.empty()) max=j+1;
                else max=Math.max(max, j-st.peek().index);
                j++;
            }
            System.out.println(max);
            
        }
    }
}
class pair{
    char c;
    int index;

    public pair(char c, int index) {
        this.c = c;
        this.index = index;
    }
    
}