package ASSIGNMENT2;

//Base class
class Employee {
 public String getRole() {
     return "Employee";
 }
}

//Subclass Manager
class Manager extends Employee {
 @Override
 public String getRole() {
     return "Manager";
 }
}

//Subclass Developer
class Developer extends Employee {
 @Override
 public String getRole() {
     return "Developer";
 }
}

//Main class to demonstrate dynamic method dispatch
public class EMP {
 public static void main(String[] args) {
     // Creating objects of subclasses
     Employee emp1 = new Manager();
     Employee emp2 = new Developer();

     // Calling getRole() method using Employee references
     System.out.println("Role of emp1: " + emp1.getRole()); // Calls Manager's getRole()
     System.out.println("Role of emp2: " + emp2.getRole()); // Calls Developer's getRole()
 }
}
