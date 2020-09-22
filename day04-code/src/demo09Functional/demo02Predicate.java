package demo09Functional;

import javax.sql.rowset.Predicate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class demo02Predicate {


    public static String get(Supplier<String> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        String s = get(() -> {
            return "asd";
        });
        System.out.println(s);
    }

}
