package com.hospital.model;

public enum Department {
    CARDIO("CARDIOLOGY"),
    ENT("ENT"),
    GASTRO("GASTROENTEROLOGY"),
    GYNAEC("GYNAECOLOGY"),
    PEDIAC("PEDIATRICS"),
    ONCO("ONCOLOGY"),
    ORTHO("ORTHOPAEDIC"),
    MED("GENERAL MEDICINE");

   public String dept;

    Department(String value) {
        this.dept = value;
    }
}
