package com.driver;

public class Main {
  public static void main(String[] args) {
    RWOnly obj=new RWOnly();

    //Before getter and setter
    //obj.name=12;                     //Error-- The field RWOnly.name is not visible
    //System.out.println(obj.name);    //Error-- The field RWOnly.name is not visible

    //after getter and setter
    obj.setName(15);
    System.out.println(obj.getName());

  }
}