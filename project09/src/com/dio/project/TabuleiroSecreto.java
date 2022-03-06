package com.dio.project;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TabuleiroSecreto {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] m = br.readLine().split(" ");
        int tt = Integer.parseInt(m[0]);
        int op = Integer.parseInt(m[1]);
        int[][] M = new int[tt][tt];

        for (int i = 0; i < tt; i++) {
            for (int j = 0; j < tt; j++) {
                M[i][j] = 0;
            }
        }

        for (int i = 0; i < op; i++) {
            String[] o = br.readLine().split(" ");
            int tipoOp = Integer.parseInt(o[0]);
            int l = Integer.parseInt(o[1]);
            int value = 0;

            if (o.length == 3) {
                value = Integer.parseInt(o[2]);
            }

            switch (tipoOp) {
                case 1:
                    lineX(l, value, M);
                    break;
                case 2:
                    colX(l, value, M);
                    break;
                case 3:
                    printLineXFreq(l, M);
                    break;
                case 4:
                    printColXFreq(l, M);
                    break;
            }
        }
    }

    public static void lineX(int l,
            int value,
            int[][] M) {
        for (int i = 0; i < M.length; i++) {
            M[l - 1][i] = value;
        }
    }

    public static void colX(int col,
            int value,
            int[][] M) {
        for (int i = 0; i < M.length; i++) {
            M[i][col - 1] = value;
        }
    }

    public static void printLineXFreq(int l,
            int[][] M) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(M[l - 1][0], 1);

        for (int i = 1; i < M.length; i++) {
            if (map.containsKey(M[l - 1][i])) {
                map.put(M[l - 1][i], map.get(M[l - 1][i]) + 1);
            } else {
                map.put(M[l - 1][i], 1);
            }
        }

        var key = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get()
                .getKey();

        if (map.get(key) == 1) {
            key = map.entrySet().stream().max((entry1, entry2) -> entry1.getKey() > entry2.getKey() ? 1 : -1).get()
                    .getKey();
        }

        System.out.println(key);
    }

    public static void printColXFreq(int col,
            int[][] M) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(M[0][col - 1], 1);

        for (int i = 1; i < M.length; i++) {
            if (map.containsKey(M[i][col - 1])) {
                map.put(M[i][col - 1], map.get(M[i][col - 1]) + 1);
            } else {
                map.put(M[i][col - 1], 1);
            }
        }

        var key = map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get()
                .getKey();

        if (map.get(key) == 1) {
            key = map.entrySet().stream().max((entry1, entry2) -> entry1.getKey() > entry2.getKey() ? 1 : -1).get()
                    .getKey();
        }

        System.out.println(key);
    }

}