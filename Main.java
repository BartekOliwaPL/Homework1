import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String rank;
        String suit;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę karty: ACE, KING, QUEEN, JACK");
        rank = scanner.nextLine();
        System.out.println("Podaj kolor karty: CLUBS, DIAMONDS, HEARTS, SPADES");
        suit = scanner.nextLine();

        Ranks myRanks = Ranks.valueOf(rank);
        Suits mySuits = Suits.valueOf(suit);

        Card myCard = new Card();

       /*  prints out one specific card
        myCard.setMyRanks(Ranks.ACE);
        myCard.setMySuits(Suits.CLUBS);*/

        myCard.setMyRanks(myRanks);
        myCard.setMySuits(mySuits);

        System.out.println(myCard.getDescription());
    }
}
