package practice1;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {




        String sentence = "I Love Java";

        String[]  words=sentence.split(" ");

        String reverse ="";

        for(int i= words[1].length()-1; i>=0; i--){
            reverse += words[1].charAt(i);
        }

        System.out.println(reverse);


        words[1] = reverse;
        System.out.println(Arrays.toString(words));

        String result ="";

        for(String word:words){
            result += word +" ";
        }

        System.out.println(result);

































    }
}
