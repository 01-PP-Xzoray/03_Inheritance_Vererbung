package com.cc.java;

public class Cat extends SuperCat {

  private int counter;

  public Cat(String firstName, String furColor, int age) {
    super(firstName, furColor, age);
  }

  public String getAge() {
      return checkEscalationLevel();
    }

  private String checkEscalationLevel() {

   counter++;

    switch (counter) {
      case 1:
        return "This is an inappropriate question!";   
      case 2:
        return "I've told you once!";
      case 3:
        return "Talk to the hand!";
      default:
        return "Fuck off!";
    }  
  }
}
  
