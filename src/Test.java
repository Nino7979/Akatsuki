
import java.util.*;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ranNum = ((int)Math.random()* 100) + 1;
        int userGuess = 0;
        while (userGuess != ranNum) {
            System.out.println("Nhap so ban doan tu 1 den 100: ");
            userGuess = sc.nextInt();

            if (userGuess < ranNum) {
                System.out.println("So ban doan nho hon");
            }
            if (userGuess > ranNum) {
                System.out.println("So ban doan lon hon");
            }
            if (userGuess == ranNum) {
                System.out.println("Ban da doan dung");
            }
            System.out.println(ranNum);
        }
    }
}
