import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int celsius = input.nextInt();
        double fahrenheit = ((double) (celsius * 9) /5) + 32;
        System.out.println(fahrenheit);
        input.close();
    }
}
