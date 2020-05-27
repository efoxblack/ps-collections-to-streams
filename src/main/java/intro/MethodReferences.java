package intro;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class MethodReferences {

//    Alternative syntax for writing lambda expressions
//    Return statement is not required as it is only one line of code
//    Function<Person, Integer> f = person -> person.getAge() ;

//    Another way to write a lambda expression
//    A matter of readability and clean code, in certain context
//    method references might be more readable
//    Function<Person, Integer> f = Person::getAge ;

//    You could write this in either two different ways
//    BinaryOperator<Integer> sum = (i1, i2) -> i1 + i2 ;
//                                = (i1, i2) -> Integer.sum(i1, i2) ;

//    BinaryOperator<Integer> sum = Integer::sum ;

//    BinaryOperator<Integer> max = Integer::max ;

//    Consumer<String> printer = s -> System.out.println(s) ;

//    Consumer<String> printer = System.out::println;
}
