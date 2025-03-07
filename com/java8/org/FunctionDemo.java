package com.java8.org;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// Function is a functional interface
// Difference with predicate is it has output also
// Function consists of compose (default), andThen(default), identity (static)

public class FunctionDemo {

    public static void main(String[] args) {
        Function<Integer, Boolean> func = x -> x > 30;

        Function<List<Employee>, List<Employee>> employeeWithSalaryAb30 = list -> {
            List<Employee> result = new ArrayList<>();
            for (Employee emp : list) {
                if (func.apply(emp.getSalary()))
                    result.add(emp);
            }
            return result;
        };

        Employee e1 = new Employee(1, "Arpit", 90);
        Employee e2 = new Employee(2, "Shubham", 40);
        Employee e3 = new Employee(3, "Umang", 24);

        List<Employee> employeeList = Arrays.asList(e1, e2, e3);

        List<Employee> out = employeeWithSalaryAb30.apply(employeeList);
        System.out.println(out);

    }


    private static class Employee {
        int id;
        String name;
        int salary;

        public Employee(int id, String name, int salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }


}
