package locale;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.function.Function;

public class Test1 {
    public static void main(String[] args) {

        var list1 = List.of("a", "b", "c", "d");

        Function<List<String>, Integer> function = (list) -> list.size();
    }
}


// it will show 10/10/2020 10:10 AM
// The pattern incorrectly uses mm instead of MM in the first part of the pattern. mm is for minutes.
// In addition, uuu pattern prints out 4 digit year.

