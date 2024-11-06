package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalesContractTest {
    @Test
    public void getTotalPrice_WithFinanceOption_CorrectTotalPrice() {
        // Arrange
        Vehicle vehicle = new Vehicle(1, 2020, "Toyota", "Camry", "Sedan", "Red", 15000, 25000.0);
        SalesContract contract = new SalesContract("2024-11-06", "John Doe", "john@example.com", vehicle, true);

        // Act
        double totalPrice = contract.getTotalPrice();

        // Assert
        
        double expectedTotalPrice = vehicle.getPrice() + (vehicle.getPrice() * 0.05) + 100 + 495;
        assertEquals(expectedTotalPrice, totalPrice, 0.01);
    }


}