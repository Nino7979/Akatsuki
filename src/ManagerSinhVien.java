
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerSinhVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            SinhVien s = new SinhVien("SV01", sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextLine());
            System.out.println(s);
        }
    }
}