import java.util.Scanner;

/**
 * Created by PaxoStudent on 2/4/2017.
 */
public class EvenOddTest {
    public static void main(String [] args){
        int num;
        System.out.println("Enter a Number ");

        Scanner input = new Scanner (System.in);
        num = input.nextInt();

        if ( num % 2 == 0)
        System.out.println("Entered Number is Even ");
        else
        System.out.println("Entered Number is Odd ");
    }
}
