import java.util.LinkedList;
import java.util.Queue;

public class Deck {

    Queue<Card> playingCards = new LinkedList();
    int counter = 36;
    int[] suitCaseHDCS = {8,8,8,8};

    /** CARDS METHODS: */

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
        int s = 0;
        int r = 0;
        for (int i = 0; i<counter; i++)
        {
            if (s == 4)
            {
                s=0;
                r++;
            }
            playingCards.add(new Card(Rank.values[r],Suit.values[s]) );

        }
    }


    /* * Впорядкування колоди за мастями та значеннями
    * Порядок сотрування:
    * Спочатку всі карти з мастю HEARTS, потім DIAMONDS, CLUBS, SPADES
    * для кожної масті порядок наступний: Ace,King,Queen,Jack,10,9,8,7,6
    * Наприклад
    * HEARTS Ace
    * HEARTS King
    * HEARTS Queen
    * HEARTS Jack
    * HEARTS 10
    * HEARTS 9
    * HEARTS 8
    * HEARTS 7
    * HEARTS 6
    * І так далі для DIAMONDS, CLUBS, SPADES */
    public void order() {
        int s = 3;
        int r = 8;

        for(Card card:playingCards)
        {
            card.setSuit(Suit.values[s]);
            card.setRank(Rank.values[r]);
            if (r==0)
            {
                s--;
                r = suitCaseHDCS[s];
            }
            else{r--;}

        }
    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
        if (playingCards.iterator().hasNext()){return true;}
        return false;
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        int c = 0;
        for (Card card:playingCards)
        {
            if (c==0)
            {
                for (int i =0; i<4; i++)
                {
                    if (card.getSuit() == Suit.values[i])
                    {
                        suitCaseHDCS[i] -=1;
                    }
                }


            playingCards.remove(card);
            counter--;
            c++;
            return card;
            }
        }

        return  null;
    }
}
