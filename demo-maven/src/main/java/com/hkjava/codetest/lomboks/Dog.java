package com.hkjava.codetest.lomboks;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
//@AllArgsConstructor
@ToString
public class Dog {
  
  private final String firstName = "John";

  @NonNull
  private String lastName;

  @NonNull
  private String color;

  public static void main(String[] args) {
    Dog dog = new Dog("Chan","red");

    System.out.println(dog);

    Dog dog2 = new Dog( null,null);// run time --> error

    System.out.println(dog2);
  }
}
