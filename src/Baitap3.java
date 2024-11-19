
import java.util.*;

public class Baitap3 {
    public static boolean nguyenTo(int n){
        if (n < 2) return false;
        for(int i = 2; i<=Math.sqrt(n); i++){
            if(n % i ==0) return false;
        } return true;
    }
    public static boolean thuanNghich(int n){
        int tmp = n, rev = 0;
        while(n != 0){
            rev = rev * 10 + n % 10;
            n /= 10;
        } return tmp == rev;
    }
    public static boolean cp(int n){
        int can = (int) Math.sqrt(n);
        if(can * can == n){
            return true;
        } return false;
    }
    public static boolean check(int n){
        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n /= 10;
        } return nguyenTo(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n;i++){
            a[i] = sc.nextInt();
        }
        int dem1 = 0, dem2 = 0, dem3 = 0, dem4 = 0;
        for(int i=0; i<n;i++){
            if(nguyenTo(a[i])){
                
                ++dem1;
            } 
        } System.out.print(dem1);
        System.out.println("");
        for(int i=0; i<n;i++){
            if(thuanNghich(a[i])){
                
                ++dem2;
            } 
        } System.out.print(dem2);
        System.out.println("");
        for(int i=0; i<n;i++){
            if(cp(a[i])){
                
                ++dem3;
            } 
        } System.out.print(dem3);
        System.out.println("");
        for(int i=0; i<n;i++){
            if(check(a[i])){
                
                ++dem4;
            } 
        } System.out.print(dem4);
        System.out.println("");
    }
}
