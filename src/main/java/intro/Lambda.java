package intro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Executors;

public class Lambda {

//    Comparator<String> comparator = new Comparator<String>() {
//        public int compare(String s1, String s2) {
//            return Integer.compare(s1.length(), s2.length());
//        }
//    };

//    Rewritten as a lambda
//    Comparator<String> comparator = (String s1, String s2) ->
//            Integer.compare(s1.length(), s2.length());

//    Can also be
//    Comparator<String> comparator = (s1, s2) -> {
//        System.out.println("It works!");
//        return Integer.compare(s1.length(), s2.length());
//    };


//    Runnable r = new Runnable() {
//        @Override
//        public void run() {
//            int i = 0;
//            while (i++ < 10) {
//                System.out.println("It works!");
//            }
//        }
//    };

//    Rewritten as a lambda
//    Runnable r = () -> {
//        int i = 0;
//        while (i++ < 10) {
//            System.out.println("It works!");
//        }
//    };

    public static void main(String[] args) {
//        Arrays.sort(comparator);
//        Executors.newSingleThreadExecutor().execute(r);
    }

}
