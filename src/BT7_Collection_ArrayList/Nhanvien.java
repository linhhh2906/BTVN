package BT7_Collection_ArrayList;

import java.util.ArrayList;

public class Nhanvien {
    public static void main(String[] args) {

        ArrayList Thongtin = new ArrayList<>();
        Thongtin.add("Name: Linh Nguyen");
        Thongtin.add("Age: 10");
        Thongtin.add("Country: VietNam");

        for(Object a : Thongtin){
            System.out.println(a);
        }
    }
}
