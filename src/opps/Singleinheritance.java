package opps;

//Parent class
class Parent {
 String name;
 int age;

 // Constructor for the Parent class
 public Parent(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Method to greet
 public void greet() {
     System.out.println("Hello, my name is " + name + ".");
 }

 // Method to introduce age
 public void introduce() {
     System.out.println("I am " + age + " years old.");
 }

 // Method to describe work
 public void work() {
     System.out.println("I work as a teacher.");
 }
}

//Child class that inherits from Parent class
class Child extends Parent {
 String school;

 // Constructor for the Child class
 public Child(String name, int age, String school) {
     // Call Parent class constructor
     super(name, age);
     this.school = school;
 }

 // Overriding the greet method
 @Override
 public void greet() {
     System.out.println("Hi! I'm " + name + ", a student at " + school + ".");
 }

 // Method to describe what the child studies
 public void study() {
     System.out.println("I study mathematics and science.");
 }

 // Overriding the work method
 @Override
 public void work() {
     System.out.println("I work on homework and projects.");
 }
}

public class Singleinheritance {
 public static void main(String[] args) {
     // Create an instance of Parent class
     Parent parent = new Parent("Alice", 45);
     parent.greet();         // Output: Hello, my name is Alice.
     parent.introduce();     // Output: I am 45 years old.
     parent.work();          // Output: I work as a teacher.

     // Create an instance of Child class
     Child child = new Child("Bob", 16, "Green Valley High School");
     Child c=(Child)new Parent("Tejashwini", 8);
     child.greet();          // Output: Hi! I'm Bob, a student at Green Valley High School.
     child.introduce();      // Output: I am 16 years old.
     child.study();          // Output: I study mathematics and science.
     child.work();           // Output: I work on homework and projects.
 }
}

