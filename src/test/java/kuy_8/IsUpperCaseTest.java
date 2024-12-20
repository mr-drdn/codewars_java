package kuy_8;

import org.junit.jupiter.api.Test;
import org.kata.kyu_8.IsUpperCase;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsUpperCaseTest {
    @Test
    public void testThisShit() {
        assertFalse(IsUpperCase.isUpperCase("c"), "Input: 'c'");
        assertTrue(IsUpperCase.isUpperCase("C"), "Input: 'C'");
        assertFalse(IsUpperCase.isUpperCase("hello I AM DONALD"), "Input: 'hello I AM DONALD'");
        assertTrue(IsUpperCase.isUpperCase("HELLO I AM DONALD"), "Input: 'HELLO I AM DONALD'");
        assertFalse(IsUpperCase.isUpperCase("ACSKLDFJSgSKLDFJSKLDFJ"), "Input: 'ACSKLDFJSgSKLDFJSKLDFJ'");
        assertTrue(IsUpperCase.isUpperCase("ACSKLDFJSGSKLDFJSKLDFJ"), "Input: 'ACSKLDFJSGSKLDFJSKLDFJ'");
    }
}
