package KienThucCore.DesignPattern.CreationalPatterns.SingletonPattern;

/*đảm bảo rằng một class chỉ có một instance (thể hiện) duy nhất trong suốt vòng đời ứng dụng */
//dùng singleton khi
// quản lý tài nguyên hệ thống (kết nối db, quản lý bộ nhớ)
// logging (chỉ cần 1 instance ghi log)
// quản lý cấu trúc toàn cục (configuration manager)


//các cách triển khai
public class Singleton {

    //eager initialization
    private static final Singleton INSTANCE = new Singleton(); //Khoi tao san
    private Singleton() {} //ngan khoi tao ben ngoai

    public static Singleton getInstance() {
        return INSTANCE;
    }

    //lazy initialization + thread-safe
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) { //kiem tra lan 1
            synchronized (Singleton.class) {
                if (instance == null) { //kiem tra lan 2
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    //dung enum( tối ưu nhất)
    public enum Singleton {
        INSTANCE;

        public void showMessage() {
            System.out.println("Hello from Singleton Enum!");
        }
    }
}


//ưu điểm là: quản lý tài nguyên tốt
//nhược điểm: khó mở rộng, có thể gây ra vấn đề trong đa luồng
