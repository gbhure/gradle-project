package com.example.project;

public class Foo {
  public String sayHello() {
    return "Hello";
  }

  public String saySomething() {
    return sayGoodBye();
  }

  public String sayGoodBye() {
    return "Goodbye";
  }
}
