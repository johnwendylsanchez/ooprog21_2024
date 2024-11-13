import java.util.Scanner;

public class SpoonerismGenerator {

    private static String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    private static int vowelIndex(String word) {
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1; 
    }

    public static void run() {
        String word1 = getWord("Enter the first word: ");
        String word2 = getWord("Enter the second word: ");
        
        int vowelIndex1 = vowelIndex(word1);
        int vowelIndex2 = vowelIndex(word2);

        if (vowelIndex1 <= 0 || vowelIndex2 <= 0) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
            return;
        }

        String word1Start = word1.substring(0, vowelIndex1);
        String word1End = word1.substring(vowelIndex1);
        String word2Start = word2.substring(0, vowelIndex2);
        String word2End = word2.substring(vowelIndex2);

        String spoonerizedWord1 = word2Start + word1End;
        String spoonerizedWord2 = word1Start + word2End;

        System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
    }

    public static void main(String[] args) {
        run();
    }
}
