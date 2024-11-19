import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập vào bậc của đa thức
        System.out.print("Nhập bậc của đa thức (n): ");
        int n = sc.nextInt();

        // Nhập vào các hệ số của đa thức
        int[] a = new int[n + 1];
        System.out.println("Nhập " + (n + 1) + " hệ số của đa thức (a[0] đến a[" + n + "]): ");
        for (int i = 0; i <= n; i++) {
            a[i] = sc.nextInt();
        }

        // Nhập vào giá trị của x
        System.out.print("Nhập giá trị của x: ");
        int x = sc.nextInt();

        // Tính giá trị của đa thức
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += a[i] * Math.pow(x, i);  // Tính giá trị cho từng hạng tử a[i] * x^i
        }

        // In ra kết quả
        System.out.println("Giá trị của đa thức tại x = " + x + " là: " + result);
    }
}

