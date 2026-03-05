package se.lexicon;

public class StringExercises {
    static void main() {

    //Exercise 1 – Length of a String

        String name = "Java";
        int length = name.length();
        System.out.println("The Length of Java is: " + length );

    //Exercise 2 – Character at Index

        String text = "Long example sentence";
        char result = text.charAt(6);
        System.out.println("The character at 6th place is: " + result);

    //Exercise 3 – Index Position of 'o'

        String text1 = "Even longer example sentence";
        int output = text1.indexOf('o');
        System.out.println("Index position is: " + output);

    //Exercise 4 – Substring

        String text2 = "Ok this is not as long!";
        String portion = text2.substring(11, 22);
        System.out.println("Extracted: " + portion);

    //Exercise 5 – Lowercase and Uppercase

        String caps = "CAPS EQUALS SCREAMING";
        String low = caps.toLowerCase();
        System.out.println("Lowercase: " +low);
        String cap = low.toUpperCase();
        System.out.println("Uppercase: " +cap);

    //Exercise 6 – Trim String

        String given =  "\tJ\ta\tv\ta\t";
        String trim = given.trim();
        System.out.println("After trimming: " + trim);

    //Exercise 7 – Parse to String

        int number = 20;
        String parse = number + "20";
        System.out.println("Parsed String is: " + parse);

    //Exercise 8 – Split String (Oil and Water)

        String value = "Oil and Water";
        String[] array = value.split("and");
        System.out.println(array[0]);
        System.out.println(array[1]);

    //Exercise 9 – Split String (Names)

        String input = "Carl,Susie,Fredrick,Bob,Erik";
        String[] arr = input.split(",");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);



    }
}
