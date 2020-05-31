//numbers multiples of 3 and 5
//for training logic and concatenation of the strings

import javax.xml.transform.Result;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Challenge5 {

    public static void fizzBuzz(int n) {
        for(int i = 1; i <= n ; i++) {
            StringBuilder result = new StringBuilder();

            if (i % 3 == 0) {
                result.append("Fizz");
            }
            if (i % 5 == 0) {
                result.append("Buzz");
            }
            if (i % 3 != 0 && i % 5 != 0) {
                result = new StringBuilder(i + "");
             }
            System.out.println(result);
        }
    }
    public static void main(String[] args) {
        int number;

        System.out.println("If a number is multiple of both 3 and 5, print 'FizzBuzz'. If a number is multiple" +
                " of 3 (but not 5), print 'Fizz'. If multiple of 5 (but not 3), print 'Buzz'. If is not a multiple" +
                " of 3 or 5, print the value.");
        System.out.println("Type a number: ");
        Scanner s = new Scanner(System.in);
        number = s.nextInt();
        Challenge5.fizzBuzz(number);
    }
}

