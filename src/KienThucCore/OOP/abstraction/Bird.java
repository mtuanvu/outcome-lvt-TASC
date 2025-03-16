package KienThucCore.OOP.abstraction;

//sử dụng interface

interface Flyable {
    void fly(); //tất cả các phương thức trong interface mặc định là abstract
}

public class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird fly");
    }
}
