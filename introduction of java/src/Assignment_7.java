package Assignments;
//Parent class
class Member {
 String name;
 int age;
 String phoneNumber;
 String address;
 double salary;

 // Method to set member details
 void setDetails(String name, int age, String phoneNumber, String address, double salary) {
     this.name = name;
     this.age = age;
     this.phoneNumber = phoneNumber;
     this.address = address;
     this.salary = salary;
 }

 // Method to print salary
 void printSalary() {
     System.out.println("Salary: " + salary);
 }
}

//Child class Employee
class Employee extends Member {
 String specialization;

 // Method to set employee details
 void setEmployeeDetails(String name, int age, String phoneNumber, String address, double salary, String specialization) {
     setDetails(name, age, phoneNumber, address, salary);
     this.specialization = specialization;
 }
}

//Child class Manager
class Manager extends Member {
 String department;

 // Method to set manager details
 void setManagerDetails(String name, int age, String phoneNumber, String address, double salary, String department) {
     setDetails(name, age, phoneNumber, address, salary);
     this.department = department;
 }
}

public class Assignment_7 {
 public static void main(String[] args) {
     // Creating objects of Employee and Manager
     Employee employee = new Employee();
     Manager manager = new Manager();

     // Setting details for employee and manager
     employee.setEmployeeDetails("John Doe", 30, "123-456-7890", "123 Main St", 50000, "Software Development");
     manager.setManagerDetails("Jane Smith", 35, "987-654-3210", "456 Oak St", 80000, "Engineering");

     // Printing employee details
     System.out.println("Employee Details:");
     System.out.println("Name: " + employee.name);
     System.out.println("Age: " + employee.age);
     System.out.println("Phone Number: " + employee.phoneNumber);
     System.out.println("Address: " + employee.address);
     employee.printSalary();
     System.out.println("Specialization: " + employee.specialization);

     System.out.println();

     // Printing manager details
     System.out.println("Manager Details:");
     System.out.println("Name: " + manager.name);
     System.out.println("Age: " + manager.age);
     System.out.println("Phone Number: " + manager.phoneNumber);
     System.out.println("Address: " + manager.address);
     manager.printSalary();
     System.out.println("Department: " + manager.department);
 }
}