import java.util.Arrays;

public class AnagramChecker {

    /**
     * Checks whether two strings (word, text) are anagrams, meaning that they contain the same characters but in diffrent order.
     * For exampls Night, Thing.
     *
     * @param subject The subject string to check
     * @param target  the target string to be compared with the subject
     * @return true if the strings are anagrams
     * false if the strings are not anagrams
     */
    public static boolean checkIfTextsAreAnagram(String subject, String target) {
        if ((subject == null && target != null) || (subject != null && target == null)) {
            return false;
        }
        if (subject == null)
            return true;
       if (subject.length() != target.length())
            return false;
        char[] subjectChars = subject.toCharArray();
        char[] targetChars = target.toCharArray();

        Arrays.sort(subjectChars);
        Arrays.sort(targetChars);

        return Arrays.equals(subjectChars, targetChars);
    }
}
