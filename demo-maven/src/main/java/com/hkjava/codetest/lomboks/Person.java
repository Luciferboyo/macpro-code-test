package com.hkjava.codetest.lomboks;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

  private String name;
  
  private int age;

  public static void main(String[] args) {
    Person person = new Person();
    person.setAge(30);
    person.setName("John");

    System.out.println(person.getName()+" "+person.getAge());

  }
}
