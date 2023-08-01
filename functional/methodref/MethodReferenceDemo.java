package functional.methodref;

import java.util.function.Function;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(4));

        /* Method Reference Using Static Method */

        Function<Integer, Double> function2 = Math::sqrt;
        System.out.println(function2.apply(4));
    }
}
