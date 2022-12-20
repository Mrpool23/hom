package homework2.home;
import java.util.Scanner;

public class PokerTest {
        public static void main(String[] args) {

            Poker poker = new Poker();

            Scanner input = new Scanner(System.in);
            do
                System.out.println("Введите количество игроков");
            while(!input.hasNextInt());
            int players = input.nextInt();
            if(players <=10) {
                for (int i = 0; i < players; i++)
                    System.out.println(poker.getDeck());
            }
            else {System.out.println("Слишком много игроков");}
        }
}
