package etc;

import java.util.ArrayList;

class Fruit implements Eatable {
    public String toString() { return "Fruit";}
}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}
class Toy                 { public String toString() { return "Toy"  ;}}

interface Eatable {}

class Ex12_3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fbox = new FruitBox<Fruit>(); //OK
        FruitBox<Apple> abox = new FruitBox<Apple>(); //OK

        FruitBox<? extends Fruit> wfbox = new FruitBox<Fruit>(); //OK
        // FruitBox<? extends Fruit> wfbox = (FruitBox<? extends Fruit>)new FruitBox<Fruit>(); //OK

        //FruitBox<Apple> -> FruitBox<? extends Fruit>
        FruitBox<? extends Fruit> wabox = new FruitBox<Apple>(); //OK

        //FruitBox<? extends Fruit> -> FruitBox<Apple> 가능?
        FruitBox<Apple> appleBox = (FruitBox<Apple>) wabox; //OK. 경고 발생


    }  // main
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}
//사실 Fruit이 Eatable 인터페이스 상속을 받아서 Eatable을 받을 필요가 없다.
//2개를 상속받을 때 ','를 쓰지 않고 '&'을 쓴다.

class Box<T> {
    ArrayList<T> list = new ArrayList<T>(); //item을 저장할 list 
    void add(T item) { list.add(item);     } //박스에 item을 추가
    T get(int i)     { return list.get(i); } //박스에서 item을 꺼낼때
    int size()       { return list.size(); }
    public String toString() { return list.toString();}
}