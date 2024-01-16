import java.util.ArrayList;
import java.util.Collections;

/**
 * 출처 : 자바의 정석 Ex11_1
 */

public class Ex11_1 {
    public static void main(String[] args) {
        //기본 길이(용량, capacity)가 10인 ArrayList를 생성
        ArrayList list1 = new ArrayList(10);
        list1.add(5); //가능하긴 함
        //기본 사용 방식
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        //생성자 ArrayList(Collection c)를 이용한 것
        ArrayList list2 = new ArrayList(list1.subList(1,4)); //ArrayList의 일부를 뽑아서 만들어줌
        // 1 <= x < 4이기 때문에 index가 1,2,3인 것을 가지고 subList를 만든다.
        //subList는 읽기 전용이라 사용할려면 새로운 리스트를 만들어주어야 한다.
        print(list1, list2);

        //Collection은 인터페이스, Collections는 유틸 클래스
        Collections.sort(list1); //list1과 list2를 정렬한다.
        Collections.sort(list2); //Collections.sort(List l)
        print(list1, list2);

        //list1이 list2의 모든 요소를 포함하고 있는가?
        System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));//true


        list2.add("B");
        list2.add("C"); //list2:[0, 2, 4, B, C]
        list2.add(3, "A"); //list2:[0, 2, 4, A, B, C]
        print(list1,list2);

        list2.set(3, "AA");
        print(list1, list2); //list1:[0, 1, 2, 3, 4, 5] list2:[0, 2, 4, AA, B, C]

        list1.add(0,"1");
        //indexOf()는 지정된 객체의 위치(인덱스)를 알려준다.
        //출력은 같지만 Integer 1과 String 1이 있다.
        System.out.println("index="+list1.indexOf("1")); //index=0
        System.out.println("index="+list1.indexOf(1)); //index=2


//        list1.remove(new Integer(1)); //숫자 1을 지움
//        list1.remove(0); //인덱스 0번 지움
//        list1.remove(1); //인덱스가 1인 객체를 삭제. boolean remove(Object obj)를 호출하는 것이 아닌, Object remove(int index)를 호출한다.

        //list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다
        System.out.println("list1.retainAll(list2):"+list1.retainAll(list2)); //true
        print(list1, list2); //list1:[0, 2, 4] list2:[0, 2, 4, AA, B, C]

        //list2에서 list에 포함된 객체들을 삭제한다.
        for(int i = list2.size()-1; i >= 0; i--){
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        /*
        1. get(i)으로 list2에서 하나씩 꺼낸다
        2. contains()로 꺼낸 객체가 list1에 있는지 확인
        3. remove(i)로 해당 객체를 list2에서 삭제
         */
        print(list1, list2); //list1:[0, 2, 4] list2:[AA, B, C]

    } //main의 끝

    private static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1:"+list1);
        System.out.println("list2:"+list2);
        System.out.println();
    }
} //class
