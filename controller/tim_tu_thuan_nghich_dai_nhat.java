
package controller;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author chien
 */
public class tim_tu_thuan_nghich_dai_nhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer> mp=new LinkedHashMap<>();
        int max=0;
        while(sc.hasNext()){
            String i=sc.next();
            StringBuilder sb=new StringBuilder(i);
            String tmp=sb.reverse().toString();
            if(tmp.equals(i)){
                if(mp.containsKey(tmp)){
                    int dem=mp.get(tmp);
                    mp.put(tmp,dem+1);
                    max=Math.max(max, i.length());
                }
                else {
                    mp.put(tmp,1);
                    max=Math.max(max, i.length());
                }
            }
        }
        Set<String> keys = mp.keySet();
        for (String key : keys) {
            if(key.length()==max){
                System.out.println(key+" "+mp.get(key));
            }
        }
    }
}
