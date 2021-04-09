package com.br.pedro.lambda.entities;

import java.util.Date;

public class Person {

    private String name;
    private String birthdayDate;
    private String document;
    private String accountNumber;

    public Person(String name, String birthdayDate, String document, String accountNumber) {
        this.name = name;
        this.birthdayDate = birthdayDate;
        this.document = document;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public void setBirthdayDate(String birthdayDate) {
        this.birthdayDate = birthdayDate;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
