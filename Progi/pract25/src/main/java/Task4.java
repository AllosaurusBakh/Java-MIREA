import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> strings = List.of(
                "(3+2) + ()()",
                "(3+2-2) + ()))()",
                "(3+2) + (4*2)(3*1)",
                ")(3+2) + ()()",
                "(((((((((3+2) + ()()"
        );
        strings.stream().filter(Task4::checkRightBraces).forEach(System.out::println); // выводит только истенные вырожения
    }
    //
    private static boolean checkRightBraces(String s) {
        return 0 == s.chars() // строка переходит в чары
                .mapToObj(Character::toString) // Каждый чар становится строкой
                .filter("()"::contains) // Пропускает только скобки
                .map("("::equals) // если равняется ( то тру
                .mapToInt(b -> b ? 1 : -1) // превращает ( в 1 и ) в -1
                .reduce(0, (x, y) -> (x >= 0 && x + y >= 0) ? x + y : -1); // если у каждой открывающей скобки есть закрывающаяя
        // и первая скобка не является закрывающей, то возвращает 0 иначе -1
    }
}