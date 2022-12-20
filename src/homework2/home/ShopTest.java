package homework2.home;
import java.util.Scanner;
public class ShopTest
{
        public static void main(String[] args) {
            Shop shop = new Shop();
            Scanner text = new Scanner(System.in);
            while (true) {
                System.out.println("1. Добавить компьютер");
                System.out.println("2. Удалить компьютер");
                System.out.println("3. Найти компьютер");
                if (!text.hasNextInt())
                {
                    text.nextLine();
                    continue;
                }
                int action = text.nextShort();
                text.nextLine();

                System.out.println("Введите название компьютера");
                String computer = text.nextLine();
                switch (action) {
                    case 1: {
                        shop.addComputer(computer);
                        System.out.println(" Компьютер " + computer + " добавлен ");
                        break;
                    }
                    case 2: {
                        shop.deleteComputer(computer);
                        System.out.println(" Компьютер " + computer + " удален ");
                        break;
                    }
                    case 3: {
                        System.out.println(shop.findComputer(computer));
                        System.out.println(" Компьютер " + computer + " найден ");
                    }
                }
            }
        }
}
