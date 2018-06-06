
public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();

        deck.shuffle();
        for (int i =0 ; i<36; i++)
        {
            System.out.println(deck.playingCards[i].getRank() +" "+deck.playingCards[i].getSuit() + "\n");
        }

    }
}
