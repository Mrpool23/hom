package homework2.home;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Poker
{
        final private List<String> cards = new ArrayList<>();
        Random random = new Random();
        Poker()
        {
            generateCards();
        }
        public void generateCards() {
            cards.addAll(
                    Arrays.asList(

                            " 2.Пики",
                            " 3.Пики",
                            " 4.Пики",
                            " 5.Пики",
                            " 6.Пики",
                            " 7.Пики",
                            " 8.Пики",
                            " 9.Пики",
                            " 10.Пики",
                            " Валет.Пики",
                            " Дама.Пики",
                            " Король.Пики",
                            " Туз.Пики",


                            " 2.Буби",
                            " 3.Буби",
                            " 4.Буби",
                            " 5.Буби",
                            " 6.Буби",
                            " 7.Буби",
                            " 8.Буби",
                            " 9.Буби",
                            " 10.Буби",
                            " Валет.Буби",
                            " Дама.Буби",
                            " Король.Буби",
                            " Туз.Буби",


                            " 2.Черви",
                            " 3.Черви",
                            " 4.Черви",
                            " 5.Черви",
                            " 6.Черви",
                            " 7.Черви",
                            " 8.Черви",
                            " 9.Черви",
                            " 10.Черви",
                            " Валет.Черви",
                            " Дама.Черви",
                            " Король.Черви",
                            " Туз.Черви",


                            " 2.Крести",
                            " 3.Крести",
                            " 4.Крести",
                            " 5.Крести",
                            " 6.Крести",
                            " 7.Крести",
                            " 8.Крести",
                            " 9.Крести",
                            " 10.Крести",
                            " Валет.Крести",
                            " Дама.Крести",
                            " Король.Крести",
                            " Туз.Крести"
                    )
            );
        }

        public String getCard() {
            int randomCard = random.nextInt(0, cards.size() - 1);
            String card = cards.get(randomCard);
            cards.remove(randomCard);
            return card;
        }
        public String getDeck(){
            if (cards.size() < 5) generateCards();

            StringBuilder deck = new StringBuilder();
            for (int i = 0; i < 5; i++)
                deck.append(getCard());
            return deck.toString();
        }

}
