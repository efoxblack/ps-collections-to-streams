package functionalinterfaces;

@FunctionalInterface
public interface Predicate<T> {

//    A lambda expression is an instance of a functional interface

//    At this point, a functional interface
//    is an interface with only one method

    boolean test(T t);

    default Predicate<T> and(Predicate<T> other) {
        return t -> test(t) && other.test(t) ;
    }

    default Predicate<T> or (Predicate<T> other) {
        return t -> test(t) || other.test(t);
    }

    static <U> Predicate<U> isEqualTo(U u) {
        return s -> s.equals(u);
    }
}
