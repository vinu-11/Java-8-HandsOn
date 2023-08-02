package functional.methodref;

import java.util.function.BiFunction;
import java.util.function.Function;

interface Printable {
    void print(String msg);
}

public class MethodReferenceDemo {

    public static int addition(int a, int b) {
        return a + b;
    }

    public void display(String msg) {
        System.out.println(msg.toUpperCase());
    }

    public static void main(String[] args) {

        /* 1. Method Reference Using Static Method */

        // Lambda Function
        Function<Integer, Double> function = (input) -> Math.sqrt(input);
        System.out.println(function.apply(4));

        // Method Reference
        Function<Integer, Double> functionMethod = Math::sqrt;
        System.out.println(functionMethod.apply(4));

        // Lambda Function
        BiFunction<Integer, Integer, Integer> biFunctionLambda = (a, b) -> MethodReferenceDemo.addition(a, b);
        System.out.println(biFunctionLambda.apply(10, 20));

        // Method Function
        BiFunction<Integer, Integer, Integer> biFunctionMethod = MethodReferenceDemo::addition;
        System.out.println(biFunctionMethod.apply(10, 20));

        /* 2. Instance Method Reference of a particular object */

        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();

        // Lambda Function

        Printable printable = (msg) -> methodReferenceDemo.display(msg);
        printable.print("hello world");

        // Method Function

        Printable printableMethod = methodReferenceDemo::display;
        printableMethod.print("hello world method");

        // 3. Reference to the instance method of an arbitrary object
        // Sometimes, we call a method of argument in the lambda expression.
        // In that case, we can use a method reference to call an instance
        // method of an arbitrary object of a specific type.

        Function<String, String> stringFunction = (String input) -> input.toLowerCase();
        System.out.println(stringFunction.apply("Vinay kumar"));

        // Using lamdba function

        Function<String, String> stringLambdaFunction = String::toLowerCase;
        System.out.println(stringLambdaFunction.apply("Vinay Kumar"));

    }
}
