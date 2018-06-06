
public class Deck {

    Card[] playingCards = new Card[36];
    int counter = 36;


    public Deck() {}

    //Перемішує колоду у випадковому порядку
    public void shuffle() {
        int s = 0;
        int r = 0;

        for (int i = 0; i<counter; i++,s++)
        {
                if (s==4)
                {
                    s=0;
                    r++;
                }

                playingCards[i] = new Card(Rank.values[s],Suit.values[s]);

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
        int s = 0;
        int r = 0;
        for (int i = 0; i<counter; i++,r++)
        {
            if (i%9==0)
            {
                s++;
            }
            if (r==9)
            {
                r=0;
            }

            playingCards[i].setRank(Rank.values[r]);
            playingCards[i].setSuit(Suit.values[s]);

        }

    }

    //Повертає true у випадку коли в колоді ще доступні карти
    public boolean hasNext() {
    }

    //"Виймає" одну карту з колоди, коли буде видано всі 36 карт повертає null
    //Карти виймаються з "вершини" колоди. Наприклад перший виклик видасть SPADES 6 потім
    //SPADES 7, ..., CLUBS 6, ..., CLUBS Ace і так далі до HEARTS Ace
    public Card drawOne() {
        playingCards[36] == R;
    }
}
