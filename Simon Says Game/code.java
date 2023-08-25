import java.util.Scanner;

public class code {
    static final int MOD = 1000000007;

    public static int sumOfAllValues(String num) {
        int n = num.length();
        long totalSum = 0;
        long currentNum = 0;
        long currentMultiplier = 1;

        for (int i = n - 1; i >= 0; --i) {
            currentNum = (currentNum + (num.charAt(i) - '0') * currentMultiplier) % MOD;
            totalSum = (totalSum + currentNum) % MOD;
            currentMultiplier = (currentMultiplier * 10 + 1) % MOD;
        }

        totalSum = (totalSum + currentNum) % MOD; // Adding currentNum one more time
        return (int) totalSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int result = sumOfAllValues(num);
        System.out.println(result);
    }
}
