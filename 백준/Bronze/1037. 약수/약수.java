import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOfN = sc.nextInt();
        int temp;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numOfN; i++) {
            temp = sc.nextInt();
            max = temp > max ? temp : max;
            min = temp < min ? temp : min;
        }

        System.out.println(max * min);
    }
}