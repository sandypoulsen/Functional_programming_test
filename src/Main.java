import java.util.Arrays;
import java.util.List;

/**
 * Created by alexanderpoulsen on 17/08/15.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Scala.test());
        String[] s = {"apple", "banana", "peach"};
        List<String> list = Arrays.asList(s);
        Scala.testint(list);

        Integer[] ints = { 1, 2, 3, 4, 5};
        int[] intarray = {2,4,6,8,10};
        List<Integer> intlist = Arrays.asList(ints);
        System.out.println("result: " + Scala.sumint(intlist));
        System.out.println("result: " + Scala.sum(intarray));


    }
}
