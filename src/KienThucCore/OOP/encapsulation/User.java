package KienThucCore.OOP.encapsulation;

//TÍnh đóng gói
// là khả che dấu dữ liệu bên trong đối tượng, chỉ cung cấp những gì cần thiết ra bên ngoài
// bảo vệ dự liệu khỏi bị thay đổi ngoài ý muốn
// thực hiện bằng cách dùng modifier như private protected public
//LỢI ÍCH: giúp bảo vệ dữ liệu, kiểm soát truy cập
public class User {
    private String username; //dữ liệu bị ẩn đi
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //cung cấp phương thức công khai để truy cập dữ liệu
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
