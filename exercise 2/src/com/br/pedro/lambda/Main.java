package com.br.pedro.lambda;

import com.br.pedro.lambda.entities.Book;
import com.br.pedro.lambda.entities.Employee;
import com.br.pedro.lambda.entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        List<Person> personList = new ArrayList<>();

        employeeList.add(new Employee(1, 1, "Godofredo Angel", "08/04/1990", "052314658", "084267"));
        employeeList.add(new Employee(2, 2, "Lucielle Armin", "20/04/1987", "048314658", "0699423"));
        employeeList.add(new Employee(3, 3, "Arnold Chimp", "04/04/1995", "236892156", "9808713"));
        employeeList.add(new Employee(4, 4, "Luke Crispr", "02/04/1970", "6899709536", "12399898"));

        personList = employeeList.stream().map(employee -> {return new Person(employee.getName(), employee.getBirthdayDate(), employee.getDocument(), employee.getAccountNumber());}).collect(Collectors.toList());
        

    }
}
