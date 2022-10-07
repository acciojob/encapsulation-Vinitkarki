package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly obj=new RWOnly();

    //Before getter and setter
    //obj.name="Vinit";                     //Error-- The field RWOnly.name is not visible
    //System.out.println(obj.name);    //Error-- The field RWOnly.name is not visible

    //after getter and setter
    obj.setName("Vinit");
    System.out.println(obj.getName());

  }
}