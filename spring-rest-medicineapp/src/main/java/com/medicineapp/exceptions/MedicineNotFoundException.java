package com.medicineapp.exceptions;

public class MedicineNotFoundException extends RuntimeException {
    public MedicineNotFoundException() {
    }

    public MedicineNotFoundException(String message) {
        super(message);
    }
}
