package com.pb.enot.hw4;

import java.util.StringTokenizer;

public class Anagram {
    public static void main(String[] args) {
        String s  = "@#ц# у ^ 9823l;A ы ^ z a d 9927##$)(^738#";
        System.out.println("@#ц# у ^ 9823l;A ы ^ z a d 9927##$)(^738#");
        System.out.println(s=s.replaceAll("[^A-z]", ""));
        StringTokenizer tok = new StringTokenizer(s,"`~!@#$%^&*()-_+=\\.,><? ");
        StringBuilder s1 = new StringBuilder();
        while(tok.hasMoreTokens()){
            s1.append(tok.nextToken());
        }
        System.out.println(s1);

    }


}
