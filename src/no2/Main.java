package no2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] str1 = {"leo", "kiki", "eden"};
        String[] str2 = {"leo", "eden"};
        System.out.println(solution(str1,str2));
    }

        static String solution(String[] participant, String[] completion) {
            Map<String, Integer> cache = new HashMap<>();

            for (int i = 0; i < participant.length; i++) {
                    cache.put(participant[i], 1);
            }

            for (int i = 0; i < completion.length; i++) {
                if (0 < cache.get(completion[i])) {
                    cache.replace(completion[i], cache.get(completion[i]) - 1);
                }
            }
            for (Map.Entry<String, Integer> item : cache.entrySet()) {
                if (0 < item.getValue())
                    return item.getKey();
            }
            return null;

    }
};