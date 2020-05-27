package functionalinterfaces;

public class Demo {

    /*
    How does it work?
    The Java compiler is smart
        the interface is functional, so there is only one method to implement
        the type of the variable gives the type of the lambda expression
        the parameters & return types must be compatible
        the same for the exceptions, if any
    If all of this holds, then the compiler can guess everything is needs
     */

//    A lambda is still an implementation of an interface


    /*      Functional Interface: Definition
    A functional interface is an interface
        with only one abstract method
        default methods do not count
        static methods do not count
        methods from the object class do not count
    A functional interface may be annotated with @FunctionalInterface
        it is not mandatory, for legacy reasons
        the compiler will tell us if an annotated interface is functional or not
     */
    public static void main(String[] args) {

        Predicate<String> p1 = s -> s.length() < 20;
        Predicate<String> p2= s -> s.length() > 5;

//        System.out.println(p.test("Hello World!!!!!!!!!!!!!!!!!"));

        boolean b = p1.test("Hello");
        System.out.println("Hello is shorter than 20 chars: " + b);

        Predicate<String> p3 = p1.and(p2);

        System.out.println("P3 for Yes: " + p3.test("Yes"));
        System.out.println("P3 for Good morning: " + p3.test("Good morning"));
        System.out.println("P3 for Good morning gentlemen: " + p3.test("Good morning gentlemen"));

        Predicate<String> p4 = p1.or(p2);

        System.out.println("P4 for Yes: " + p4.test("Yes"));
        System.out.println("P4 for Good morning: " + p4.test("Good morning"));
        System.out.println("P4 for Good morning gentlemen: " + p4.test("Good morning gentlemen"));

        Predicate<String> p5 = Predicate.isEqualTo("Yes");

        System.out.println("P5 for Yes: " + p5.test("Yes"));
        System.out.println("P5 for No: " + p5.test("No"));

        Predicate<Integer> p6 = Predicate.isEqualTo(1);


    }
}
