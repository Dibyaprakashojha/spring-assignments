package com.medicineapp.model;

public enum PackSize {
    ML200("200ML"),
    ML100("100ML"),
    ML300("300ML"),
    ML450("450ML");

    String pack;

    PackSize(String pack) {
        this.pack = pack;
    }
}
