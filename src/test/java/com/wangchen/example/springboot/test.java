package com.wangchen.example.springboot;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class test {

    class jie {
        long a;
        long b;

        jie(long a, long b) {
            this.a = a;
            this.b = b;
        }
    }

    public int show(String xy) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(xy));
        String tempString;
        int n = Integer.parseInt(reader.readLine());
        jie[] value = new jie[n];
        int j = 0;
        while ((tempString = reader.readLine()) != null) {
            value[j++] = new jie(Integer.parseInt(tempString.split(" ")[0]), Integer.parseInt(tempString.split(" ")[1]));
        }

        Arrays.sort(value, new com());

        long[] dp = new long[n];
        dp[0] = value[0].b - value[0].a;

        long max = value[0].b;
        long temp = dp[0];
        long val = dp[0];

        for (int i = 1; i < dp.length; i++) {
            if (value[i].b <= max) {
                temp = 0;
                continue;
            }
            if (value[i].a >= value[i - 1].b) {
                dp[i] = value[i].b - value[i].a;
            } else if (value[i].a < value[i - 1].b) {
                long gong = value[i - 1].b - value[i].a;
                dp[i] = value[i].b - value[i].a - gong;
                dp[i - 1] = dp[i - 1] - gong;
                if (dp[i] < 0)
                    dp[i] = 0;
                if (dp[i - 1] <= 0)
                    dp[i - 1] = 0;
                if (dp[i] < temp) {
                    temp = dp[i];
                }
                if (dp[i - 1] < temp)
                    temp = dp[i - 1];
            }
            max = value[i].b;
            val += dp[i];
        }
        return (int) (val - temp);
    }

    class com implements Comparator<jie> {


        @Override
        public int compare(jie o1, jie o2) {
            if (o1.a > o2.a)
                return 1;
            else if (o1.a < o2.a)
                return -1;
            return 0;
        }
    }

    public static void main(String[] args) throws IOException {
        test t = new test();
        System.out.println(t.show("d:\\/input.txt"));
    }
}
