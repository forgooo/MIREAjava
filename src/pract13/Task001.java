package pract13;

import java.util.Locale;

public class Task001 {
    public static void ILoveJava(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {
        String s = "I Love Java!!!";
        ILoveJava(s);
        System.out.println(s.charAt(s.length()-1));
        System.out.println(s.endsWith("!!!"));
        System.out.println(s.startsWith("I Love"));
        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java"));
        System.out.println(s.replace('a', 'o'));
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(1,5));

    }
}

