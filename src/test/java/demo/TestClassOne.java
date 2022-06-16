package demo;

import org.testng.annotations.*;

public class TestClassOne {

  @BeforeGroups("chocolate")
  public void setupChocolate() {
    System.out.println("setupChocolate()");
  }

  @AfterGroups("chocolate")
  public void teardownChocolate() {
    System.out.println("teardownChocolate()");
  }

  @BeforeGroups("drink")
  public void setupDrink() {
    System.out.println("setupDrink()");
  }

  @AfterGroups("drink")
  public void teardownDrink() {
    System.out.println("teardownDrink()");
  }

  @Test(groups = "chocolate")
  public void snickers(){
    System.out.println("snickers()");
  }

  @Test(groups = "chocolate")
  public void mars() {
    System.out.println("mars()");
  }

  @Test(groups = "drink")
  public void cola() {
    System.out.println("cola()");
  }

  @Test(groups = "drink")
  public void pepsi() {
    System.out.println("pepsi()");
  }
}

