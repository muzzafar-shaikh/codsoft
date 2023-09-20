import java.util.Scanner;
import java.util.Random;
public class NumberGuess
{
    public static void main(String[] args) {
        //generate random number between 1 to 100...
        Random rand=new Random();
        int number=rand.nextInt(100)+1;

//        set number of attempts
        int attempt=5;

//        score initialization
        int score=0;

        Scanner sc=new Scanner(System.in);
        boolean play=true;
        while(play) {
            while (attempt > 0) {
                System.out.println("guess the number between (1-100) ");
                int guess = sc.nextInt();

                if (guess == number) {
                    System.out.println("you Guess the correct number...!! ");
                    score += attempt;
                    break;
                } else if (guess > number) {
                    System.out.println(" too large...!!");
                } else if (guess < number) {
                    System.out.println(" too small...!!");
                }
                attempt--;
                System.out.println("you have " + attempt + " attempt left.!");
            }
            System.out.println("your score is " + score);
            System.out.println("The correct number is : "+number);

            System.out.print(" want to play again press  1 else press 2 : ");
            int again=sc.nextInt();

            if (again!=1) {
                play=false;
            }
            else {
                number = rand.nextInt(100) + 1;
                attempt = 5;
                score = 0;
            }
        }

    }
}
