package etc;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex11_5 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator();

        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        //iterator은 1회용이라 다 쓰고 나면 다시 얻어와야 한다.
        it = list.iterator();

        while (it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        //아래 for문 같은 경우는 컬렉션은 ArrayList -> HashSet으로 바꾼다면 사용하지 못하는 코드이다.
        //HashSet에는 get()이 없기 때문이다. 하지만 Iterator은 사용가능하다.
        for(int i=0; i<list.size(); i++){
            Object obj = list.get(i);
            System.out.println(obj);
        }
    }//main
}
