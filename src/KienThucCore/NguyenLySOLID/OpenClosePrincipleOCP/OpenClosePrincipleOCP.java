package KienThucCore.NguyenLySOLID.OpenClosePrincipleOCP;

//nguyên lý đóng mở
//có thể thoải mái mở rộng một class, nhưng không sửa đổi bên class đó

//theo nguyên lý này, chúng ta không thay đổi hiện trạng của lớp sẵn có, nếu muốn thêm tính năng mới
//thì hãy mở rộng class cũ bằng cách kế thừa để xây dựng class mới
//như thế thì sẽ tránh được tình huống làm hỏng tính ổn định của chương trình đang có


//lợi ích: không phải lo lắng về code sử dụng các class nguồn bởi vì chúng ta đã không sửa đổi chúng
//vì vậy hành vi của chúng phải giống nhau
//tuy nhiên khi chú ý vào ý nghĩa của các chức năng, tránh tạo nhiều class dẫ xuất


class UserServiceV2 {
    private Validator validator;

    public UserServiceV2(Validator validator) {
        this.validator = validator;
    }

    public void saveUser() {
        if (this.validator.isValid()) {
            // Do save
        } else {
            // Show error
        }
    }
}

interface Validator {
    boolean isValid();
}

class UserValidator1 implements Validator {
    @Override
    public boolean isValid() {
        return true;
    }
}

class UserValidator2 implements Validator {
    @Override
    public boolean isValid() {
        return false;
    }
}

public class OpenClosePrincipleOCP {
    public static void main(String[] args) {
        UserServiceV2 userService1 = new UserServiceV2(new UserValidator1());
        UserServiceV2 userService2 = new UserServiceV2(new UserValidator2());
    }
}
