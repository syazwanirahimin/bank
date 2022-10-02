package org.example.entities;

public class Account {

    public Account(String name, String debitAcctNo) {
        this.name = name;
        this.debitAcctNo = debitAcctNo;
    }

    private String name;
    private final String debitAcctNo;
    private Double money = 0.0;

    public void deposit(Double value) {
        if (value > 0) {
            this.money += value;
            System.out.println("MYR " + value + " has successfully deposited");
        } else {
            System.out.println("Value less than or equal to 0, unable to perform operation");
        }
    }

    public Double withdrawMoney(Double value) {
        if (value > 0 && value <= this.money) {
            System.out.println("MYR " + value + " has successfully withdrawn");
            this.money -= value;
            return value;
        }

        System.out.println("Invalid requested value");
        return 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDebitAcctNo() {
        return debitAcctNo;
    }

    public Double getMoney() {
        return money;
    }


}
