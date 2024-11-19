
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class Mainn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Book> arr = new ArrayList<>();
        sc.nextLine();  // Đọc dòng trống sau sc.nextInt()
        
        for (int i = 0; i < n; i++) {
            // Nhập thông tin tác giả

            
            // Nhập thông tin sách
            String name = sc.nextLine();
            double price = sc.nextDouble();
            int qty = sc.nextInt();
            sc.nextLine();  // Đọc dòng trống sau sc.nextInt()
            Author x = new Author(sc.nextLine(), sc.nextLine(), sc.nextLine().charAt(0));
            Book b = new Book(name, x, price, qty);
            arr.add(b);
        }

        // Sắp xếp theo giá giảm dần, nếu giá bằng nhau thì sắp xếp theo tên
        Collections.sort(arr, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                if (o1.getPrice() != o2.getPrice()) {
                    return Double.compare(o2.getPrice(), o1.getPrice());  // Sắp xếp giảm dần theo giá
                } else {
                    return o1.getName().compareTo(o2.getName());  // Sắp xếp tăng dần theo tên nếu giá bằng nhau
                }
            }
        });

        // In ra danh sách sách sau khi sắp xếp
        for (Book x : arr) {
            System.out.println(x);
        }
    }
}
