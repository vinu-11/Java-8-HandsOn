package lambda.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        String emailId = null;

          //empty method
//        Optional<Object> emptyOptional = Optional.empty();
//        System.out.println(emptyOptional);
//
          //of method
//        Optional<String> emailIdOptional = Optional.of(emailId);
//        System.out.println(emailIdOptional.get());

        //ofNullable
        Optional<String> stringOptional = Optional.ofNullable(emailId);
        String defaultVariable = stringOptional.orElse("default@gmail.com");  //orElse Method
        System.out.println(defaultVariable);

        //orElseGet
        String defaultOptional = stringOptional.orElseGet(() -> "default@gmail.com");  //orElseGet Method Uses Supplier Interace
        System.out.println(defaultOptional);

        //orElseThrow
//        String emailNotExist = stringOptional.orElseThrow(() -> new IllegalArgumentException("Email not exist"));
//        System.out.println(emailNotExist);

        //ifPresent Method

        Optional<String> gender = Optional.of("Male");
        Optional<String> emptyOptional = Optional.empty();

        gender.ifPresent((s) -> System.out.println("Value is present"));
        emptyOptional.ifPresent((s) -> System.out.println("Value is not present")); //Returns nothing


        String result = "abc";
        if(result != null && result.contains("abc")){
            System.out.println(result);
        }

        Optional<String> optionalStr = Optional.of(result);
        optionalStr.filter(res -> res.contains("abc"))
                .ifPresent((res)-> System.out.println(res));

//        if(stringOptional.isPresent()){                       //isPresent() Method
//            System.out.println(stringOptional.get());
//        }else{
//            System.out.println("No value Present");
//        }

        //System.out.println(stringOptional.get());
    }
}
