
package controller;

import java.util.Scanner;

public class dien_thoai_cuc_gach {
    static String val(Character c)
    {
        if (c <= 'C')
            return "2";
        else if (c <= 'F')
            return "3";
        else if (c <= 'I')
            return "4";
        else if (c <= 'L')
            return "5";
        else if (c <= 'O')
            return "6";
        else if (c <= 'S')
            return "7";
        else if (c <= 'V')
            return "8";
        return "9";
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            String s = sc.next().toUpperCase();
            String a = "";
            for (int i = 0; i < s.length(); ++i)
                a += val(s.charAt(i));
            String res = new StringBuilder(a).reverse().toString();
            if (a.equals(res))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
