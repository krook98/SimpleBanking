import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //creating class Scanner
        System.out.println("Enter a character");
        //int a = scanner.nextInt(); //scans the next input as an int
        char c  =  scanner.next().charAt(0); //scans the first letter of a character
        System.out.println("value =" +c);
    }
}
