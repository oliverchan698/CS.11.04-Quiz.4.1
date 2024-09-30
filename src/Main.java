import java.util.Arrays;

public class Main {

    /* Personal testing scripts using all the MainTest.java tests (since MainTest.java doesn't work for me)
    public static void main(String[] args) {
        System.out.println("numberOfVowels:");
        System.out.println(numberOfVowels("relax, you're doing fine") + ", ans 9");
        System.out.println(numberOfVowels("let him cook") + ", ans 4");
        System.out.println(numberOfVowels("aaaaah!!!") + ", ans 5\n");

        System.out.println("notDivisibleBy235:");
        System.out.println(notDivisibleBy235(5) + ", ans 1");
        System.out.println(notDivisibleBy235(10) + ", ans 2");
        System.out.println(notDivisibleBy235(100) + ", ans 26");
        System.out.println(notDivisibleBy235(1000) + ", ans 266\n");

        System.out.println("camelCaseMe:");
        System.out.println(camelCaseMe("the-stealth-warrior") + ", ans theStealthWarrior");
        System.out.println(camelCaseMe("The_Stealth_Warrior") + ", ans TheStealthWarrior");
        System.out.println(camelCaseMe("The_Stealth-Warrior") + ", ans TheStealthWarrior");
        System.out.println(camelCaseMe("-no_shot_bruh_") + ", ans NoShotBruh");


    }
    */

    /** 1. Write a method called numberOfVowels that returns the number of vowels in a string.
     Consider a, e, i, o, u as vowels. **/

    public static int numberOfVowels(String input) {
        int count = 0;
        for (int index = 0; index < input.length(); index++) {
            if (input.charAt(index) == 'a' || input.charAt(index) == 'e' || input.charAt(index) == 'i' || input.charAt(index) == 'o' || input.charAt(index) == 'u' || input.charAt(index) == 'A' || input.charAt(index) == 'E' || input.charAt(index) == 'I' || input.charAt(index) == 'O' || input.charAt(index) == 'U') {
                count = count + 1;
            }
        }
        return count;
    }

    /* 2. Write a method called notDivisibleBy235 that finds the number of natural numbers not exceeding N
     and not divisible by any of the numbers [2, 3, 5].
     Example
     Let's take the number 5 as an example:
     1 - doesn't divide integer by 2, 3, and 5
     2 - divides integer by 2
     3 - divides integer by 3
     4 - divides integer by 2
     5 - divides integer by 5
     Answer: 1 (only one number does    n't divide integer by any of 2, 3, 5) */

    public static int notDivisibleBy235(int num){
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 > 0 && i % 3 > 0 && i % 5 > 0) {
                count++;
            }
        }
        return count;
    }

    /* 3. Write a method called camelCaseMe so that it converts dash/underscore delimited words into camel casing.
     * The first word within the output should be capitalized only if the original word was capitalized
     * (known as Upper Camel Case, also often referred to as Pascal case).
     * The next words should always be capitalized.
     Examples
     "the-stealth-warrior" gets converted to "theStealthWarrior"
     "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
     "The_Stealth-Warrior" gets converted to "TheStealthWarrior" **/

    public static String camelCaseMe(String input){
        String[] split = input.split("(?!^)"); // I got this split parameter from Stack Exchange
        String output = "";
        int num = 0;
        for (String letter : split) {
            if (letter.equals("-") || letter.equals("_")) {
                split[num] = "";
                if (num < split.length - 1) {
                    split[num+1] = split[num+1].toUpperCase();
                }
            }
            output = output + split[num];
            num++;
        }
        return output;
    }

}
