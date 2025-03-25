package KienThucCore;

//viết code tạp mảng lưu trữ danh sách nhân viên. Sắp xếp mảng theo thứ tự tăng dần. In ra nhân viên lớn tuổi nhất

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class BaiTapJavaInterview2 {
    String name;
    int age;

    public BaiTapJavaInterview2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + "}";
    }

}

    class EmployeeSort {
        public static void main(String[] args) {
            BaiTapJavaInterview2[] employees = {
                    new BaiTapJavaInterview2("An", 25),
                    new BaiTapJavaInterview2("Bình", 30),
                    new BaiTapJavaInterview2("Châu", 22),
                    new BaiTapJavaInterview2("Dũng", 35),
                    new BaiTapJavaInterview2("Hạnh", 28)
            };

            Arrays.sort(employees, Comparator.comparingInt(e -> e.age));

            System.out.println("Danh sách nhân viên sau khi sắp xếp:");
            for (BaiTapJavaInterview2 e : employees) {
                System.out.println(e);
            }

            BaiTapJavaInterview2 oldestEmployee = employees[employees.length - 1];
            System.out.println("\nNhân viên có tuổi lớn nhất: " + oldestEmployee);
        }
}
