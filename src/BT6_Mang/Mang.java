package BT6_Mang;

public class Mang {
    public static void main(String[] args) {
        int a[] = new int[26];
        int indexMang = 0;

        for(int i =0; i< 51; i++) {
            if (i % 2 == 0) {
                a[indexMang] = i;
                indexMang++;
            }
        }
        for(int k= 0; k< a.length; k++)
            System.out.println(a[k]);

        }
    }
