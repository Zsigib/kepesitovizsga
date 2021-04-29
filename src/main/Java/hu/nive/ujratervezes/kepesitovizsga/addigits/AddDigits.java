package hu.nive.ujratervezes.kepesitovizsga.addigits;

import java.util.ArrayList;

import java.util.List;


public class AddDigits {
    public int addDigits(String s) {

        if ( s == null || s.length() == 0) {
            return -1;
        }int sum = 0;
        List<Integer> numbers = new ArrayList<>();
        for (int c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.add(c);

                for (int n = 0; n < numbers.size();  n++) {
                    sum += n;
                }

            }

        }
        return sum;}
}
