import java.util.Random;
import java.util.Scanner;
public class HuntGame {
    public static void main(String[] args) {

        int shoot;
        Sleeper sleeper = new Sleeper();
        Scanner console = new Scanner(System.in);
        Random random = new Random();


        System.out.println("      ---WELCOME---      ");
        System.out.println("   <--- BOAR HUNT --->   ");
        System.out.println("  press any key to start ");
        console.nextLine();

        for(;;){

            shoot = random.nextInt(3)+1;
            Sleeper.sleepCode();

            if(shoot==1 || shoot==2){

                System.out.println("YOU MISSED !!!");


            }
            else if(shoot==3){

                System.out.println("PERFECT KILL");
                break;

            }


        }

    }
}
