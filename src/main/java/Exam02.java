import java.util.Scanner;

public class Exam02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a;

        a = sc.nextInt();

        if (a % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
            sc.close();
        }
    }
}