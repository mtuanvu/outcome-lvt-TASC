package KienThucCore.NguyenLySOLID.SingleResponsibilityPrincipleSRP;


//nguyên lý đơn chức năng
// tức là một class chỉ giữ 1 trách nhiệm duy nhất, chỉ có thể sửa đổi class với 1 lý do duy nhất

import KienThucCore.OOP.encapsulation.User;

public class SingleResponsibilityPrincipleSRP {
    //Get data from database
    public User getUser() {
        return null;
    }

    //Check validation
    public boolean isValid() {
        return true;
    }

    //show notification
    public void showNotification() {

    }

    //logging
    public void logging() {
        System.out.println("This is a logging");
    }
}


//như bên trên thì class này thực hiện rất nhiều trách nhiệm khác nhau: lấy dữ liệu từ db, notification, validate...
//khi muốn sửa 1 chúc năng nào đó thì class này nó sẽ bị phình to ra
//khó khăn khi maintain, upgrade, fix bug, test, ...
//theo đúng nguyên tắc này, phải tách ra làm nhiều class riêng, mỗi class chỉ có một nhiệm vụ duy nhất
//tuy số lượng class nhiều hơn nhưng việc sửa chữa sẽ đơn giản hơn, dễ dàng tái sử dụng hơn, class ngắn hơn lên cũng ít bog hơn
//chẳng hạn: UserRpepository, UserValidator, SystemLooger,....
