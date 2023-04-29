import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String [] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("########## Welcome to Anagram Checker ##########");
        System.out.println("########## Please enter the first word/text ##########");
        String subject = reader.readLine();

        System.out.println("########## Please enter the second word/text ##########");
        String target = reader.readLine();

        if (AnagramChecker.checkIfTextsAreAnagram(subject,target))
            System.out.println("########## The given words/texts are Anagrams! ##########");
        else
            System.out.println("########## The given words/texts are not Anagrams! ##########");

    }
}
