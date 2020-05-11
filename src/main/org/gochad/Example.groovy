package main.org.gochad

import groovy.transform.*

@ToString
class Person {
    String firstName
    String lastName
    Date dob   
}

@ToString
class Employee {
    String name;
    int age;
    double salary;
}

Person person = new Person(firstName: "Pavan", lastName: "Singaraju")
println person

Employee employee = new Employee(name: "Pavan Singaraju", age: 42, salary: 1.5)
println employee