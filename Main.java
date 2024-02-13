import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        System.out.println("//---------------------------------------Exercise 5------------------------------------");
        Scanner input= new Scanner(System.in);

/*5. Develop a program that takes a sentence as input and extracts a substring from it,
then prints the extracted substring.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
= 10, End Index = 20
• Expected Output: "brown fox"*/
        System.out.println("Please write any sentence you want :");
        String strextract=input.nextLine();
        strextract=strextract.substring(10,20);
        System.out.println("the extracted substring is  :"+strextract);

    }
}