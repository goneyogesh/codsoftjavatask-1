import java.util.*;
public class main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int round_count=0;
        System.out.println("Welcome to random number generator guess game: ");
        for(int i=1;i<3;i++){
            System.out.println("Round "+i+" is started");
            int Random_number=rand.nextInt(100);
            int count=0;
            while(count!=10){
                System.out.println("Guess the number : ");
                int guess_number=sc.nextInt();
                if(guess_number==Random_number){
                    System.out.println("Your guess is correct");
                    count++;
                    break;
                }
                else if(guess_number<Random_number){
                    System.out.println("Your guess is too low");
                    count++;
                }
                else if(guess_number>Random_number){
                    System.out.println("Your guess is too high");
                    count++;
                }
            }
            if(count == 10){
                System.out.println("The number of attempts are exceeded in round ");
                System.out.println("Better luck next time!");
                System.out.println();
            }
            else{
                System.out.println("Congratulations you won these round");
                System.out.println("Your score in round "+i+" is "+count);
                System.out.println();
                round_count++;
            }
        }
        if(round_count!=0){
            System.out.println("Congratulations you are won in "+round_count+" rounds");
        }
        else{
            System.out.println("You loose the game");
        }
    }
}
