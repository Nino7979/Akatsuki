
import java.util.*;

public class test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String email = sc.nextLine();
//        System.out.println(email.substring(0, email.indexOf("@")));
            String s = sc.nextLine();
            int dem = 0;
            for (char x : s.toCharArray()){
                if (x >= 'A' && x <= 'Z'){
                    dem++;
                }
            } System.out.println(dem);
    }
}
