package labsheet1;

import java.util.Scanner;
public class TextAnalyser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int characters = 0, lower = 0, words = 0, edword = 0;
        String text = " ";
        for (int i = 1; i <= 3; ) {
            System.out.print("Please enter piece of text " + i +":\n");
            text = input.nextLine();
            if (text == "") {
                characters++;
            }
            if (text == "a" || text == "e" || text == "i" || text == "o" || text == "u") {
                lower++;
            }
            if (text == " ") {
                words++;
            }
            if (text == "ed") {
                edword++;

            }
            System.out.println("\n\n\t\t***Text Data***\n\n" +
                    "Number of characters: " + characters + "\n" +
                    "Number of lowercase vowels: " + lower + "\n" +
                    "Number of words: " + words + "\n" +
                    "Number of times 'ed' appears in the text: " + edword + "\n\n");
        }
        System.exit(0);


    }
}
