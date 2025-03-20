package KienThucCore.DesignPattern.CreationalPatterns.FactoryPattern;


//giúp ẩn logic tạo đối tượng, cho phép tạo đối tượng mà không cần chỉ định chính xác lớp cụ thẻ
//dùng factory khi
//có nhiều loại đối tượng với cách khởi tạo khác nhau
//cần ẩn đi chi tiết khởi tạo phức tạp
//cần giảm phụ thuộc vào các class cụ thể (loose coupling)

//cách triển khai

//b1: tạp interface chung
interface Animal {
    void speck();
}

//b2: cac class cu the
class Dog implements Animal {
    public void speck() {
        System.out.println("Dog");
    }
}

class Cat implements Animal {
    public void speck() {
        System.out.println("Cat");
    }
}


//b3: tao factory de an logic khoi tao
class AnimalFactory {
    public static Animal getAnimal(String type) {
        if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        }

        throw new IllegalArgumentException("Invalid animal type");
    }
}

//b4: su dung factory
public class Factory {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal("dog");
        dog.speck();

        Animal cat = AnimalFactory.getAnimal("cat");
        cat.speck();
    }

}

//ưu điểm: giảm phụ thuộc, dễ mở rộng
//nhước điểm: có thể có nhiều calss Factory nếu không thiết kế tốt
