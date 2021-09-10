package com.training.org;

public class XYZBank {
    private String bankName;
    private String bankAddress;
    private int noOfEmployees;

    public XYZBank() {
        System.out.println("default constructor");
        bankName="";
        bankAddress="";
        noOfEmployees=0;
    }

    public XYZBank(String bankName, String bankAddress, int noOfEmployees) {
        this.bankName = bankName;
        this.bankAddress = bankAddress;
        this.noOfEmployees = noOfEmployees;
    }

    @Override
    public String toString() {
        return "XYZBank " +
                "bankName='" + bankName + '\'' +
                ", bankAddress='" + bankAddress + '\'' +
                ", noOfEmployees=" + noOfEmployees;
    }
}
