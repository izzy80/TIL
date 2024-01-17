package etc;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_12 {
    public static void main(String args[]) {
        HashSet setA   = new HashSet();
        HashSet setB   = new HashSet();
        HashSet setHab = new HashSet();
        HashSet setKyo = new HashSet();
        HashSet setCha = new HashSet();

        setA.add("1");	 setA.add("2");  setA.add("3");
        setA.add("4");  setA.add("5");
        System.out.println("A = "+setA); //A = [1, 2, 3, 4, 5]

        setB.add("4");	 setB.add("5");  setB.add("6");
        setB.add("7");  setB.add("8");
        System.out.println("B = "+setB); //B = [4, 5, 6, 7, 8]

        //1. 교집합
        //setA.retainAll(setB); //공통된 요소만 남기고 삭제
        Iterator it = setB.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            if(setA.contains(tmp))
                setKyo.add(tmp);
        }

        //2. 차집합
        //setA.removeAll(setB); //setB와 공통 요소를 제거
        it = setA.iterator();
        while(it.hasNext()) {
            Object tmp = it.next();
            if(!setB.contains(tmp))
                setCha.add(tmp);
        }

        //3. 합집합
        //setA.addAll(setB); //setB의 모든 요소를 추가(중복 제외)
        it = setA.iterator();
        while(it.hasNext())
            setHab.add(it.next());

        it = setB.iterator();
        while(it.hasNext())
            setHab.add(it.next());


        //결과 출력
        //A ∩ B = [4, 5]
        System.out.println("A ∩ B = " + setKyo);  // 한글 ㄷ을 누르고 한자키
        //A U B = [1, 2, 3, 4, 5, 6, 7, 8]
        System.out.println("A U B = " + setHab);  // 한글 ㄷ을 누르고 한자키
        //A - B = [1, 2, 3]
        System.out.println("A - B = " + setCha);
    }
}

