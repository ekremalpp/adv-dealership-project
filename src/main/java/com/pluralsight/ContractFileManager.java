package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContractFileManager {

    private String fileName = "contracts.csv";

    public void saveContract(Contract contract) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true));
            bufferedWriter.write(contract.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
            System.out.println("Contract saved successfully to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}