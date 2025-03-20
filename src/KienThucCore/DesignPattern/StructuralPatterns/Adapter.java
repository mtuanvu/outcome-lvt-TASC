package KienThucCore.DesignPattern.StructuralPatterns;


//adapter pattern giúp chuyển đổi interface không tương thích để chúng có thể làm việc cùng nhau
//nó hoạt động như "bộ chuyển đổi"
//giống như cục sạc chuyển đổi từ 220v xuống 5v vào điện thoại

//dùng adapter khi
//cần tích hợp một thư viện cũ vào hệ thống mới
//hai interface không tương thích cần làm việc cùng nhau
//cần tái sử dụng code cũ mà không sửa đổi code gốc

//triển khai

//b1 tạo Target interface
interface NewCharger {
    void chargeWithTypeC();
}

//b2 tao adaptee
class OldCharger {
    public void chargeWithMicroUSB() {
        System.out.println("Micro USB");
    }
}

//b3 tao adapter để chuyển đổi từ oldchanger sang newcharger
class ChaegerAdapter implements NewCharger {
    private OldCharger oldCharger;

    public ChaegerAdapter(OldCharger oldCharger) {
        this.oldCharger = oldCharger;
    }

    @Override
    public void chargeWithTypeC() {
        System.out.println("Chuyen doi tu Type-C sang micro usb");
        oldCharger.chargeWithMicroUSB();
    }
}

//b4 su dung adapter
public class Adapter {
    public static void main(String[] args) {
        OldCharger oldCharger = new OldCharger();

        NewCharger adapter = new ChaegerAdapter(oldCharger);

        adapter.chargeWithTypeC();
    }
}
