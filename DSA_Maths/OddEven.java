import java.util.Scanner;

public class OddEven{

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        System.out.println(isOdd(num));
    }

    private static boolean isOdd(int num){
        return (num & 1) == 1;
    }

}