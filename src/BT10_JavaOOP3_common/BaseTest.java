package BT10_JavaOOP3_common;

public class BaseTest {

    public static void createDriver(String browser, boolean report, boolean headless){

        System.out.println("Mở trình duyệt:" + browser+ report + headless );
    }
    public static void closeDriver(){
        System.out.println("Closed browser:" + Constants.browser);
    }

}
