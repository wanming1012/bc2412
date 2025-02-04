package com.bootcamp.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// JDK (Java Development Kit) = Dev Library/Tool + JRE + JVM
// Dev Lib => javac, class Library BigDecimal (java.math), StringBuilder(java.lang)
// 1. Some of the library auto-imported by Java Project (i.e. java.lang)
// 2. but some of them need to be imported manually (i.e. java.math)
// 3. Maven: download external (outside JDK) library from maven public (i.e. lombok)
// class level annotation
@Getter // can be field level annotation
@Setter // can be field level annotation
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode // extends? implements? potential bugs => better not use lombok if inheritance is needed
@Builder
public class Person {
  private String name;

  @ToString.Exclude
  private int age;

  public static void main(String[] args) {
    Person p1 = new Person();
    p1.setAge(20);
    p1.setName("Peter");

    Person p2 = new Person("Tommy", 10);
    System.out.println(p2.getAge());
    System.out.println(p2.getName());
    System.out.println(p1);

    Person p3 = new Person("Tommy", 10);
    System.out.println(p2.equals(p3));
    System.out.println(p2.hashCode() == p3.hashCode());

    Person p4 = Person.builder().name("Tommy").age(10).build();
    System.out.println(p4);
  }
}
