package functionalinterfaces;

public class FunctionalInterfacesToolbox {

    /*      New Package java.util.function
    There are 43 functional interfaces in the package
    Split into four categories:
        consumers
        suppliers
        functions
        predicates
     */

    /*      The consumers
    A consumer consumes an object and does not return anything
     */

//    Consumer<String> printer = s -> System.out.println(s);
//    MethodReference          = System.out::println;

    /*      The supplier
    A supplier provides an object, takes no parameter
     */

//    Supplier<Person> personSupplier = () -> new Person();
//    MethodReference                 = Person::new;

    /*      The functions
    A function takes an object and returns another object
     */

//    Function<Person, Integer> ageMapper = person -> person.getAge();
//    MethodReference                     = Person::getAge;

    /*      The predicates
    A predicate takes an object and returns a boolean
     */

//    Predicate<Person> ageGT20 = person -> person.getAge() > 20;
}
