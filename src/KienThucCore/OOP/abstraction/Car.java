package KienThucCore.OOP.abstraction;

//tính trừu tượng
//ẩn đi các chi tiết không cần thiết, chỉ tập trung vào những gì quan trọng
//có thể thực hiện bằng
//lớp trừu tượng (abstract class)
//interface

//Lợi ích: hạn chế phụ thuộc giữa các thành phần, dễ mở rộng

//sử dụng abstract class
abstract class Vehicle {
    abstract void move(); //phương thức trừu tượng

    void stop() { //phương thức bình thường
        System.out.println("Vehicle stopped");
    }
}


public class Car extends Vehicle{
    @Override
    void move() {
        System.out.println("Car move");
    }
}
