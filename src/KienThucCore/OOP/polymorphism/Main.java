package KienThucCore.OOP.polymorphism;

//Overriding: ghi đè phương thức
class Animal {
    void makeSound() {
        System.out.println("MakeSound.....");
    }
}


class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog MakeSound.....");
    }

}
public class Main {
    public static void main(String[] args) {
        Animal newD = new Dog();
        newD.makeSound(); //output: dog makesound
    }
}
