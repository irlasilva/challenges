//this challenge is about recursive factorial

import java.util.Scanner;

public class Challenge4 {

    public static int firstFactorial(int num) {

        if (num >= 1) {
            return num * firstFactorial(num - 1);
        }
        else {
            return 1;
        }
    }

    public static void main (String[] args) {
        //Type a number to input and calculate factorial
        System.out.println("Type a number:");
        Scanner s = new Scanner(System.in);
        System.out.print(firstFactorial(s.nextInt()));
    }

}
