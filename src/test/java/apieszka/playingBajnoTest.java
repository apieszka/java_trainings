package apieszka;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class playingBajnoTest {
    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals( "Nope!", "Martin does not play banjo", playingBanjo.areYouPlayingBanjo("Martin"));
        assertEquals( "Nope!", "Rikke plays banjo", playingBanjo.areYouPlayingBanjo("Rikke"));
        assertEquals( "Nope! Remember lower case counts, too!", "rolf plays banjo", playingBanjo.areYouPlayingBanjo("rolf"));
        assertEquals( "Nope!", "bravo does not play banjo", playingBanjo.areYouPlayingBanjo("bravo"));
    }
}
