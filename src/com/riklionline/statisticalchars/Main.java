package com.riklionline.statisticalchars;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            Solution solution = new Solution();

            Map<String, Integer> res = solution.getLettersCounts(s);

            //System.out.println(res);
            if (res.containsKey("Numbers")) {
                System.out.println("Numbers=" + res.get("Numbers"));
            }
            if (res.containsKey("Others")) {
                System.out.println("Others=" + res.get("Others"));
            }
            if (res.containsKey("Letters")) {
                System.out.println("Letters=" + res.get("Letters"));
            }
            if (res.containsKey("Spaces")) {
                System.out.println("Spaces=" + res.get("Spaces"));
            }

            sc.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
