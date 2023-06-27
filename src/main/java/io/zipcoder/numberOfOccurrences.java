package io.zipcoder;

public class numberOfOccurrences {
    private static String string = "isnotisnotisnotis";

    public static void main(String[] args) {
        containsEqualNumberOfIs(string);
    }


    public static void containsEqualNumberOfIs(String input) {

        int is = 0;
        int lastIndex1 = 0;
        String substring = "is";


        while (lastIndex1 != -1) {
            lastIndex1 = input.indexOf(substring, lastIndex1);
            if (lastIndex1 != -1) {
                is++;
                lastIndex1 += substring.length();
            }
        }

        System.out.println(is);



    }

}

