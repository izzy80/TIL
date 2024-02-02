package etc;

import java.util.*;

public class Ex11_17 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("김자바", 90);
        map.put("김자바", 100);
        map.put("이자바", 100);
        map.put("강자바", 80);
        map.put("안자바", 90);

        Set set = map.entrySet();
        Iterator it = set.iterator();

        while(it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            System.out.println("이름 : "+ e.getKey() + ", 점수 : " + e.getValue());
        }

        set = map.keySet();
        System.out.println("참가자 명단 : " + set); //참가자 명단 : [안자바, 김자바, 강자바, 이자바]

        Collection values = map.values();
        it = values.iterator();

        int total = 0;

        while(it.hasNext()) {
            int i = (int)it.next();
            total += i;
        }

        System.out.println("총점 : " + total); //총점 : 370
        System.out.println("평균 : " + (float)total/set.size()); //평균 : 92.5
        System.out.println("최고점수 : " + Collections.max(values)); //최고점수 : 100
        System.out.println("최저점수 : " + Collections.min(values)); //최저점수 : 80
    }
}