package demo;

import org.testng.annotations.*;

public class TestClassThree {


  @Test(priority = 4)
  public void snickers(){
    System.out.println("snickers()");
  }

  @Test(priority = 3)
  public void mars() {
    System.out.println("mars()");
  }

  @Test(priority = 2)
  public void cola() {
    System.out.println("cola()");
  }

  @Test(priority = 1)
  public void pepsi() {
    System.out.println("pepsi()");
  }
}