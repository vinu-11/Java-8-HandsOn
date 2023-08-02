package lambda.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String emailId = null;

//        Optional<Object> emptyOptional = Optional.empty();
//        System.out.println(emptyOptional);
//
//        Optional<String> emailIdOptional = Optional.of(emailId);
//        System.out.println(emailIdOptional.get());

        Optional<String> stringOptional = Optional.ofNullable(emailId);
        String defaultVariable = stringOptional.orElse("default@gmail.com");  //orElse Method
        System.out.println(defaultVariable);

        String defaultOptional = stringOptional.orElseGet(() -> "default@gmail.com");  //orElseGet Method Uses Supplier Interace
        System.out.println(defaultOptional);


//        if(stringOptional.isPresent()){                       //isPresent() Method
//            System.out.println(stringOptional.get());
//        }else{
//            System.out.println("No value Present");
//        }

        //System.out.println(stringOptional.get());
    }
}
