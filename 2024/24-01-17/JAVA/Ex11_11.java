package etc;

import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person("David",10));
        set.add(new Person("David",10));

        System.out.println(set);
    }
}

//equals()와 hashCode()를 오버라이딩해야 HashSet이 바르게 동작.
//그렇지 않으면 출력 결과가 [David:10, abc, David:10]로 중복된 클래스도 집어넣는다.
//올바른 결과는 [David:10, abc]이다.
class Person {
    String name;
    int age;

    @Override
    public int hashCode() {
        //int hash(Object... values); //가변인자 : 매개변수 마음대로
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Person)) return  false;

        Person p = (Person)o;

        //나 자신(this)의 이름과 나이를 p와 비교
        //형변환 안 하면 Object에는 name과 age가 없어서 오류가 난다.
        return this.name.equals(p.name) && this.age == p.age;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name +":"+ age;
    }
}
