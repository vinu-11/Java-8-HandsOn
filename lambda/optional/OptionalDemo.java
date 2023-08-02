package lambda.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String emailId = null;

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        Optional<String> emailIdOptional = Optional.of(emailId);
        System.out.println(emailIdOptional.get());

        Optional<String> stringOptional = Optional.ofNullable(emailId);

        if(stringOptional.isPresent()){
            System.out.println(stringOptional.get());
        }else{
            System.out.println("No value Present");
        }

        //System.out.println(stringOptional.get());
    }
}
