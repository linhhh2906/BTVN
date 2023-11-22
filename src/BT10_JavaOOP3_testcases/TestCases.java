package BT10_JavaOOP3_testcases;

import BT10_JavaOOP3_common.BaseTest;
import BT10_JavaOOP3_common.Constants;

public class TestCases  extends BaseTest {
    public static String URL = "https://cms.anhtester.com/login";

    public static void Testcaselogin() {
        createDriver(Constants.browser, Constants.headless, Constants.report);
        System.out.println("Go to URL:" + URL);
        System.out.println("Input email:" + Constants.email);
        System.out.println("Input password:" + Constants.password);
        System.out.println("Click button login:" + Constants.buttonlogin);
        closeDriver();

    }

    public static void TestcaseAddcategory() {
        createDriver(Constants.browser, Constants.headless, Constants.report);
        System.out.println("Add a new category:" + Constants.buttonadd);
        closeDriver();
    }

    public static void main(String[] args) {
        TestCases testCases = new TestCases();
        testCases.Testcaselogin();
        System.out.println(" #######  TC2: Add a new category: ####### ");
        testCases.TestcaseAddcategory();
    }
}