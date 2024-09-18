import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int myNumber = (int) (Math.random() * 100);
        int userNumber = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Guess my number");
            userNumber = sc.nextInt();

            if (userNumber == myNumber) {
                System.out.println("woohoo.... correct number");
                break;
            } else if (userNumber > myNumber) {
                System.out.println(" Your Number is too large");
            } else {
                System.out.println("Your Number is too small");
            }
        }while (userNumber >= 0) ;

            System.out.println("My number was: " + myNumber);
            // System.out.println(myNumber);

        }
    }





