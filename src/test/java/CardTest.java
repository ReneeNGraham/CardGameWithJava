import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class CardTest {

   Card card;

    @Before
    public void setUp() throws Exception {
        card = new Card(Rank.ACE, Suit.HEARTS);

        
    }

    @Test
    public void cardHasRank() {
        assertEquals(1, card.getRank());
    }

    @Test
    public void cardHasSuit() {
        assertEquals("Hearts", card.getSuit());
    }


}






