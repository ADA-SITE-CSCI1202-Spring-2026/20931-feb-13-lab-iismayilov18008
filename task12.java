import java.util.Scanner;
public class task12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the digit: ");
        int a = sc.nextInt();
        int b=0;
        int sum=0;
        int product=1;
        int average;
        int count=0;
        while (a>0){
            b=a%10;
            a=a/10;
            count++;
            sum+=b;
            product*=b;

        }
        average=sum/count;
        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Product: %d%n", product);
        System.out.printf("Average: %d%nRemainder: %d%n", average, sum%count);
        sc.close();

    }
}
