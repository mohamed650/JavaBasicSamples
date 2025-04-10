package com.upskill.linearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Khalid";
        char target = 'm';
        System.out.println(searchTarget(name, target));
    }

    static boolean searchTarget(String name, char target) {
        if(name.length() == 0) {
            return false;
        }

        for(int i=0; i<name.length(); i++) {
            if(target == name.charAt(i)) {
                return true;
            }
        }

        /*for(char ch : name.toCharArray()) {
            if(ch == target) {
                return true;
            }
        }*/
        return false;
    }
}
