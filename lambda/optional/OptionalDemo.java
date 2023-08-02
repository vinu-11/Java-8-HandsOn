package lambda.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String emailId = "vinay@gmail.com";

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        Optional<String> emailIdOptional = Optional.of(emailId);
        System.out.println(emailIdOptional);

        Optional<String> stringOptional = Optional.ofNullable(emailId);
        System.out.println(stringOptional);
    }
}
