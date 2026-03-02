import java.util.Scanner;

public class useCase2PalindromeCheckerApp {
    public static void main(String [] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("Input text:");
                String str = sc.nextLine();
                String reversed = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    reversed += str.charAt(i);
                }
                if (str.equals(reversed)) {
                    System.out.println("It is a palindrome?:true");
                } else {
                    System.out.println("It is not a palindrome?:false");
                }
                sc.close();



    }
}
