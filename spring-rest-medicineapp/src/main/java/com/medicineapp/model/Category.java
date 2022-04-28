package com.medicineapp.model;

public enum Category {
    COVID("COVID ESSENTIALS"),
    BABY("BABY PRODUCTS"),
    AYURVEDIC("AYURVEDIC CARE"),
    HOMEOPATHY("HOMEOPATHY CARE");

    String categoryType;

    Category(String type) {
        this.categoryType = type;
    }
}
