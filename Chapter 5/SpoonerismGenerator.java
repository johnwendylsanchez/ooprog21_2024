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
        
        StringBuilder spoonerizedWord1 = new StringBuilder();
        StringBuilder spoonerizedWord2 = new StringBuilder();

        for (int i = 0; i < vowelIndex2; i++) {
            spoonerizedWord1.append(word2.charAt(i));
        }
        for (int i = vowelIndex1; i < word1.length(); i++) {
            spoonerizedWord1.append(word1.charAt(i));
        }

        for (int i = 0; i < vowelIndex1; i++) {
            spoonerizedWord2.append(word1.charAt(i));
        }
        for (int i = vowelIndex2; i < word2.length(); i++) {
            spoonerizedWord2.append(word2.charAt(i));
        }

        System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
    }

    public static void main(String[] args) {
        run();
    }
}
