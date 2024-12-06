import org.junit.jupiter.api.Test;
import org.kata.kyu_8.YesOrNo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YesOrNoTest {
    @Test
    public void testBoolToWord() {
        assertEquals("Yes", YesOrNo.boolToWord(true));
        assertEquals("No", YesOrNo.boolToWord(false));
    }
}
