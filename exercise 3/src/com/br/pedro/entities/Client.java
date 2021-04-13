package com.br.pedro.entities;

public class Client {
    private String name;
    private String typeReceivingUser;
    private Double balance;

    public Client(String name, String typeReceivingUser, Double balance) {
        this.name = name;
        this.typeReceivingUser = typeReceivingUser;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeReceivingUser() {
        return typeReceivingUser;
    }

    public void setTypeReceivingUser(String typeReceivingUser) {
        this.typeReceivingUser = typeReceivingUser;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
