import java.util.Scanner;
public class VowelConsonantCount {
    
    static boolean isVowel(char c) {
        String vowels = "aeiouAEIOU";
        for(char ch : vowels.toCharArray()) {
            if(c == ch) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] arr = new char[8];

        System.out.println("Enter 8 characters: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = scan.next().charAt(0);
        }

        int vowelCount=0;
        int consoCount=0;
        for(int i=0; i<arr.length; i++) {
            if(isVowel(arr[i])) {
                vowelCount++;
            } 
            else {
                consoCount++;
            }
        }

        System.out.println("Vowels : " + vowelCount);
        System.out.println("Consonants : " + consoCount);

        scan.close();
    }
}
