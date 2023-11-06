package BT7_Collection_ArrayList;

import java.util.ArrayList;

public class BT7 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList<>();
        int max = 50;
        for(int i =0; i<= 50; i++){
            if(i % 2 == 0){
                list.add(i);
            }
        }
        for(int j =0; j<list.size(); j++){
            System.out.println(list.get(j));
        }

    }
}
