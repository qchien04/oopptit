/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author chien
 */
public class sap_xep_ma_tran {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("MATRIX.in"));
        int t = Integer.parseInt(br.readLine());

        while(t-- >0) {
            String[] line1 = br.readLine().trim().split("\\s+");
            int N = Integer.parseInt(line1[0]);
            int M = Integer.parseInt(line1[1]);
            int col = Integer.parseInt(line1[2]) - 1;
            int[][] matrix = new int[N][M];
            String[] line2 = br.readLine().trim().split("\\s+");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    matrix[i][j] = Integer.parseInt(line2[i * M + j]);
                }
            }
            int[] column = new int[N];
            for (int i = 0; i < N; i++) {
                column[i] = matrix[i][col];
            }
            Arrays.sort(column);
            for (int i = 0; i < N; i++) {
                matrix[i][col] = column[i];
            }
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }

        br.close();
    }
}

