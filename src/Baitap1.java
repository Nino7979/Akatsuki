import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Baitap1 {
    
    private static Map<String, String> memo = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        int winsForCuong = 0;
        int draws = 0;
        int winsForMai = 0;

        for (int x = 1; x <= n; x++) {
            for (int y = 1; y <= n; y++) {
                String outcome = gameState(x, y);
                switch (outcome) {
                    case "cuong":
                        winsForCuong++;
                        break;
                    case "draw":
                        draws++;
                        break;
                    case "mai":
                        winsForMai++;
                        break;
                }
            }
        }

        System.out.println(winsForCuong);
        System.out.println(draws);
        System.out.println(winsForMai);
        
        scanner.close();
    }

    private static String gameState(int x, int y) {
        String key = x + "," + y;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        // Check if both are odd
        if (x % 2 == 1 && y % 2 == 1) {
            return "mai";  // Mai wins
        }

        // Keep track of possible states
        boolean canCuongWin = false;

        // If x is even, check the first move
        if (x % 2 == 0) {
            String nextState1 = gameState(x / 2, y + x / 2);
            if (nextState1.equals("cuong")) {
                canCuongWin = true;
            }
        }

        // If y is even, check the second move
        if (y % 2 == 0) {
            String nextState2 = gameState(x + y / 2, y / 2);
            if (nextState2.equals("cuong")) {
                canCuongWin = true;
            }
        }

        // If Cuong can force a win, return "cuong"
        if (canCuongWin) {
            memo.put(key, "cuong");
            return "cuong";
        }

        // If neither player can win directly, it's a draw
        memo.put(key, "draw");
        return "draw";
    }
}
