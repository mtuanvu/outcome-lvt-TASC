package KienThucCore.OOP.inheritance;

//Tính kế thừa
// cho phép một lớp con kế thừa thuộc tính và phương thức từ một lớp cha
// giúp giảm mã dư thừa, tái sử dụng tốt hơn
//LỢI ÍCH: tái sử dụng đọan mã, mở rộng tính năng dễ dàng

//Lớp cha (super class)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " eats ...");
    }
}

//lớp con kế thừa Animal
class Dog extends Animal {
    void bark() {
        System.out.println(name + " barks ...");
    }
}


public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Buddy";
        dog.eat(); //Kế thừa từ lớp cha
        dog.bark(); // Phương thức riêng của Dog
    }
}
