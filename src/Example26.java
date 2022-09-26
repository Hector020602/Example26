import java.util.Scanner;
public class Example26 {
    public static void main(String[] argv) {

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        int num;
        System.out.println("Enter a number");
        num = inputValue.nextInt();

        for (int i = 1; i <= num ; i++) {

            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
