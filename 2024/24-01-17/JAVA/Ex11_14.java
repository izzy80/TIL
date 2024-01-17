package etc;

import java.util.*;

public class Ex11_14 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet(); //범위 검색에 유리(from ~ to)

        String from = "b";
        String to	= "d";

        set.add("abc");      set.add("alien");    set.add("bat");
        set.add("car");      set.add("Car");      set.add("disc");
        set.add("dance");    set.add("dZZZZ");    set.add("dzzzz");
        set.add("elephant"); set.add("elevator"); set.add("fan");
        set.add("flower");

        System.out.println(set); //[Car, abc, alien, bat, car, dZZZZ, dance, disc, dzzzz, elephant, elevator, fan, flower]
        System.out.println("range search : from " + from  +" to "+ to); //range search : from b to d
        System.out.println("result1 : " + set.subSet(from, to)); //result1 : [bat, car]
        System.out.println("result2 : " + set.subSet(from, to + "zzz")); //result2 : [bat, car, dZZZZ, dance, disc]
    }
}
