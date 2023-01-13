package com.driver;

public class Main {
  public static void main(String[] args){
      RWOnly obj = new RWOnly();
      obj.name="Vaivv";
      System.out.print(obj.name);
//      java: name has private access in com.driver.RWOnly
      obj.getName();
      obj.setName(John);
  }
}