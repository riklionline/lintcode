package com.riklionline.statisticalchars;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * Keys in Map:
     * Letters
     * Spaces
     * Numbers
     * Others
     */
    public Map<String, Integer> getLettersCounts(String s) {

        int nums = 0;
        int letters = 0;
        int spaces = 0;
        int others = 0;

        Map<String, Integer> map = new HashMap<>();

        char[] charArray = s.toCharArray();
        for (char c : charArray) {
            if (Character.isDigit(c)){
                nums++;
                continue;
            }
            if(Character.isLetter(c)){
                letters++;
                continue;
            }
            if(Character.isSpaceChar(c)){
                spaces++;
                continue;
            }
            others++;
        }

        if (nums > 0) {
            map.put("Numbers", nums);
        }
        if (letters > 0) {
            map.put("Letters", letters);
        }
        if (spaces > 0) {
            map.put("Spaces", spaces);
        }
        if (others > 0) {
            map.put("Others", others);
        }

        return map;
    }

}
