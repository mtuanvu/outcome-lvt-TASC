package KienThucCore.OOP.polymorphism;

//Tính đa hình
// Một đối tượng có thể có nhiều hình thái khác nhau, tức là có thể goị cùng một phương thức nhưng kết quả khác nhau
// có 2 loại
// Method overloading (tại thời điểm biên dịch): cùng một tên phương thức nhưng khác tham số
// Method Overriding (tại thời điêm chạy): lớp con ghi đè phương thức của lớp cha
// LỢI ÍCH: linh hoạt, dễ mở rộng


//Overloading: Napj chồng phương thức
public class MathUtil {
    //cùng tên phương thức nhưng khác tham số
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
