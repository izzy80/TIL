package etc;

import com.sun.source.tree.Tree;

import java.util.*;

public class Ex11_13 {
    public static void main(String[] args) {
        Set set = new TreeSet(); //범위 검색, 정렬 필요없음
//        Set set = new HashSet(); //정렬 필요
        //객체
//        set set = new Treeset(new TestComp());


        for (int i = 0; set.size() < 6 ; i++) {
            int num = (int)(Math.random()*45) + 1;
            set.add(num);  // set.add(new Integer(num));
            //객체
//            set.add(new Test());
        }

        System.out.println(set);
        //TreeSet : [15, 20, 22, 25, 42, 44] //정렬O
        //HashSet : [32, 39, 9, 25, 43, 28] //정렬X
    }
}

//class Test { } //비교 기준이 없음
//class TestCom implements Comparable{
//    @Override
//    public int compareTo(Object o) {
//        return -1;
//    }
//}
//
//class TestComp implements Comparator{
//
//    @Override
//    public int compare(Object o1, Object o2) {
//        return -1; //0이면 같은 객체라고 판단
//    }
//}
