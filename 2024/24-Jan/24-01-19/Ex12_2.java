package etc;

import java.util.*;

class Ex12_2 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>(); //jdk 1.7부터 생성자에 타입지정 생략가능
        map.put("자바왕", new Student("자바왕", 1,1,100,100,100));

        //public Student get(Object key) {}
        Student s = map.get("자바왕");


        System.out.println(map);
    } // main
}

class Student {
    String name = "";
    int ban; //반
    int no; //번호
    int kor;
    int eng;
    int math;

    public Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}