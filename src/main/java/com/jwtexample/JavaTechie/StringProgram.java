package com.jwtexample.JavaTechie;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringProgram {

    public static void main(String...args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str2 = scanner.next();
        String ind_word;
        StringTokenizer st = new StringTokenizer(str);
        Map<String,Integer> map = new HashMap<>();
        int count = 0;

        while(st.hasMoreTokens()){
            ind_word = st.nextToken();
            //ind_word = I
            if(map.containsKey(ind_word)){
                count = map.get(ind_word);
                count++;
                map.put(ind_word,count);
            }
            else{
                count = 1;
                map.put(ind_word,count);
            }
        }
        System.out.println(count);
    }
}
