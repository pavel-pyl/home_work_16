package demo;

import org.testng.annotations.*;
import org.testng.annotations.Test;

@Test
public class SimpleTest {
//  @DataProvider
//  public Object[][] data() {
//    return new String[][] {new String[] {"data1"}, new String[] {"data2"}};
//  }
//
//  @Test(dataProvider = "data")
//  public void test(String d) {
//    Assert.assertEquals("First Line\nSecond Line", "Third Line\nFourth Line");
//  }
    @BeforeTest
    public void setup() {
        System.out.println("setup()");
    }

    @AfterTest
    public void teardown() {
        System.out.println("teardown()");
    }

    @Test
    public void firstTest(){
        System.out.println("firstTest");
    }

}