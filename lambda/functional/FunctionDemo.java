package Lambda.functional;

import java.util.function.Function;

class FunctionalImpl implements Function<String, Integer> {

    @Override
    public Integer apply(String t) {
        return t.length();
    }

}

public class FunctionDemo {
    public static void main(String[] args) {
        // Function<String, Integer> function = new FunctionalImpl();
        // System.out.println(function.apply("Vinaykumar"));

        Function<String, Integer> function = (String t) -> (t.length());
        System.out.println(function.apply("vinaykumar"));

    }
}
