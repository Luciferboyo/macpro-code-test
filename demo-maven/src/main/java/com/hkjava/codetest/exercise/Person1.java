package com.hkjava.codetest.exercise;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@EqualsAndHashCode
public class Person1 {

  private final String firstName;

  @NonNull
  private String lastName;
  public static void main(String[] args) {
    //Person1 person1 = new Person1("Hello","World");

    //Person1 person12 = new Person1();

    Person1 person3 = new Person1("hello","world");

    Person1 person4 = new Person1("hello","world");
    System.out.println(person3.equals(person4));
  }
}
