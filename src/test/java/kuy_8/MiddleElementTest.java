package kuy_8;

import coderun.MiddleElement;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiddleElementTest {

    @Test
    public void testMiddleElementCase1() throws IOException {
        // Тест с входными данными: "1 2 3". Ожидаемое значение: "2".
        String input = "1 2 3\n";
        String expectedOutput = "2\n";
        assertMiddleElement(input, expectedOutput);
    }

    @Test
    public void testMiddleElementCase2() throws IOException {
        // Тест с входными данными: "1000 -1000 0". Ожидаемое значение: "0".
        String input = "1000 -1000 0\n";
        String expectedOutput = "0\n";
        assertMiddleElement(input, expectedOutput);
    }

    @Test
    public void testMiddleElementCase3() throws IOException {
        // Тест с входными данными: "3 1 3". Ожидаемое значение: "3".
        String input = "3 1 3\n";
        String expectedOutput = "3\n";
        assertMiddleElement(input, expectedOutput);
    }

    @Test
    public void testMiddleElementCase4() throws IOException {
        // Тест с входными данными: "10 10 10". Ожидаемое значение: "10".
        String input = "10 10 10\n";
        String expectedOutput = "10\n";
        assertMiddleElement(input, expectedOutput);
    }

    private void assertMiddleElement(String input, String expectedOutput) throws IOException {
        // Сохраняем оригинальные потоки ввода и вывода для восстановления после теста
        InputStream originalIn = System.in;
        PrintStream originalOut = System.out;

        try (ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
             ByteArrayOutputStream out = new ByteArrayOutputStream()) {

            // Подменяем стандартные потоки ввода и вывода для эмуляции ввода и захвата вывода
            System.setIn(in);
            System.setOut(new PrintStream(out));

            // Вызываем метод main из основного класса, чтобы протестировать его поведение
            MiddleElement.middleElement(new String[]{});

            // Сравниваем фактический результат с ожидаемым значением
            assertEquals(expectedOutput, out.toString());
        } finally {
            // Восстанавливаем стандартные потоки ввода и вывода, чтобы не повлиять на другие тесты
            System.setIn(originalIn);
            System.setOut(originalOut);
        }
    }
}
