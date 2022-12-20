package homework2.home;
import java.util.Scanner;
public class How_many {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        while (input.nextLine() != "")
        {
            counter++;
            System.out.println(counter);
        }
    }
}
