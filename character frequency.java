import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      
        String str = scan.nextLine();  
        char ch = 's';                 
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
                System.out.println(i);  // fixed spelling
            }
        }
        System.out.println("Count: " + count);
    }
}
