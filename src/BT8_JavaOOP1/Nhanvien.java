package BT8_JavaOOP1;

public class Nhanvien {
    // Khai báo kiểu dữ liệu
    String name;
    int age;
    int ID;
    Nhanvien(String n, int a, int i){
        name = n;
        age = a;
        ID = i;
    }

    void showInfo(){
        System.out.println("Thông tin nhân viên:" +" " + "Tên:"+ " " + name +" " +"Tuổi:" +" "+ age +" "+ "Mã NV:"+" "+ ID);
    }

    public static void main(String[] args) {
        Nhanvien BT = new Nhanvien("Bibi" , 20 , 2023);
        Nhanvien BT1 = new Nhanvien("Bobo" , 30 , 1029);

//        Gọi phương thức hiển thị dữ liệu
        BT.showInfo();
        BT1.showInfo();

    }
}
