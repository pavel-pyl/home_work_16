package demo;

import org.testng.annotations.*;

public class TestClassTwo {
  @DataProvider(name = "MyDataProvider")
  public Object[][] getdata() {
    return new Object[][]{
        {"June", "Summer"},
        {"Septemper", "Autumn"},
        {"February", "Winter"},
    };
  }

  @Test(dataProvider = "MyDataProvider")
  public void testDataProvider(String month, String season) {
    System.out.println("Month: " + month + ". Season: " + season);
  }

  @Parameters({"value1", "result"})
  @Test
  public void testXml(String value1, String result) {
    System.out.println("Value is " + value1);
    System.out.println("Result is " + result);
  }
}