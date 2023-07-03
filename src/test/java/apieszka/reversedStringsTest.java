package apieszka;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class reversedStringsTest {
    @Test
    public void sampleTests() {
        assertEquals("dlrow", reversedStrings.solution("world"));
    }
}
