//
//package controller;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Scanner;
//
//
//public class lop_pair {
//
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(new File("DATA.in"));
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int n = sc.nextInt();
//            boolean check = false;
//            for (int i = 2; i <= 2 * Math.sqrt(n); i++) {
//                Pair<Integer, Integer> p = new Pair<>(i, n - i);
//                if (p.isPrime()) {
//                    System.out.println(p);
//                    check = true;
//                    break;
//                }
//            }
//            if (!check) {
//                System.out.println(-1);
//            }
//        }
//    }
//}
//class Pair<T1, T2> {
//    private T1 first;
//    private T2 second;
//
//    public Pair(T1 first, T2 second) {
//        this.first = first;
//        this.second = second;
//    }
//
//
//    public boolean isPrime() {
//        int num1 = (Integer) this.first;
//        int num2 = (Integer) this.second;
//
//        return isPrime(num1) && isPrime(num2);
//    }
//
//    private boolean isPrime(int num) {
//        if (num <= 1) return false;
//        for (int i = 2; i * i <= num; i++) {
//            if (num % i == 0) return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return first + " " + second;
//    }
//    
//    
//}