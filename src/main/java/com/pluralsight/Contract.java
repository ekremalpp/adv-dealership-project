package com.pluralsight;

public abstract class Contract {
    private String date;
    private String customerName;
    private String customerEmail;
    private String vehicleSold;

    public Contract(String date, String customerName, String customerEmail, String vehicleSold) {
        this.date = date;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
    }

    public String getDate() {
        return date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getVehicleSold() {
        return vehicleSold;
    }

    public abstract double getTotalPrice();
    public abstract double getMonthlyPayment();
}
