package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String, String> languages = new HashMap<String, String>();
        languages.put("Java" , "A high level platform independent language" );
        languages.put("Python" , "A high level language, overhyped by emo-kids");
        languages.put("C" , "Mother of all languages");
        languages.put("Javascript" , "fucked up");
        languages.put("Scratch" , "Starter language developed by MIT");
        languages.put("Logo" , "First language");
        languages.put("C++" , "Fastest OOP language");


//        System.out.println(languages.get("C"));
        if(languages.containsKey("Java")){
            System.out.println("This key already exists");
        } else {
            languages.put("Java" , "Newly added");
        }
        System.out.println(languages.get("Java"));

        System.out.println("====================================");
        System.out.println("Printing the list");
        printList(languages);
        System.out.println("=====================================");
        languages.remove("C");
        System.out.println("Removed 'C'");
        printList(languages);
//        System.out.println("=====================================");
//        if(languages.remove("Java" , "aaaaaaaaaaaa")){
//            System.out.println("aaaa");
//        } else {
//            System.out.println("bbb");
//        }

        languages.replace("C++", "sss", "aaaaaaaa");
        printList(languages);


//        System.out.println(languages.values());
    }

    public static void printList(Map map){
        for (Object key: map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
    }
}
