package tt_pro;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FormatText {
    static String formatText(String string) {
        Set<String> excludeSymbols = new HashSet<>(List.of("!", "?"));

        String inputString = Arrays.stream(string.split(""))
                .filter(symbol -> !excludeSymbols.contains(symbol))
                .collect(Collectors.joining(""));
        return inputString;
    }

    public static void main(String[] args) {
        System.out.println(formatText("!Откуда я! узнал, что так делать?"));
    }
}
