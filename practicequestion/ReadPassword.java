package practicequestion;

import java.util.Scanner;

public class ReadPassword {

    int firstWordLenght;
    int secondWordLenght;

    void findShorterWord(String firstWord , String secondWord){
       firstWordLenght = firstWord.length();
       secondWordLenght = secondWord.length();

       int shorterWord = Math.min(secondWordLenght,firstWordLenght);
        System.out.println(shorterWord);
    }

    public static void main(String[] args) {
        ReadPassword rp = new ReadPassword();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Word ");
        String firstWord = sc.nextLine();
        System.out.println("Enter second word");
        String secondWord = sc.nextLine();
        rp.findShorterWord(firstWord,secondWord);
    }
}
