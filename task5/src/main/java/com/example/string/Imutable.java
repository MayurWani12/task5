package com.example.string;

public final class Imutable {   //declare class final
    
    private final String name;  //use the final keyword 
    //use private
    private final int salary;

    // Constructor
    public Imutable(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

   
    public String getName() {
        return name;
    }

                                                 //no setter for all field
    public int getSalary() {
        return salary;
    }

   
    @Override
    public String toString() {
        return "Immutable [name=" + name + ", salary=" + salary + "]";
    }

 
    public Imutable withName(String newName) {
        return new Imutable(newName, this.salary);
    }

    // Method to create a new instance with a different salary
    public Imutable withSalary(int newSalary) {
        return new Imutable(this.name, newSalary);
    }
}
