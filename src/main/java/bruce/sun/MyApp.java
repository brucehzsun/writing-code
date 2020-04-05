package bruce.sun;

import bruce.sun.example.Order;

import java.util.Arrays;
import java.util.List;

public class MyApp {
    public static void main(String[] args) {
        System.out.println("hello world");
        new Order(1, "from test");

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        long count = strings.stream().filter(s -> s.isEmpty()).count();
        System.out.println("count = "+count);
    }
}
