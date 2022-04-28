package com.hospitalapp.util;

public class Queries {
    public static final String INSERTQUERY = "INSERT INTO DOCTORS(doctor_name,doctor_position,department,doctor_fees,availability)values(?,?,?,?,?)";
    public static final String UPDATEQUERY = "UPDATE DOCTORS SET doctor_fees = ? WHERE doctor_id = ?)";
    public static final String DELETEQUERY = "DELETE FROM DOCTORS WHERE doctor_id = ?";

    public static final String SELECTQUERY = "SELECT * FROM DOCTORS";
    public static final String DEPARTMENTQUERY = "SELECT * FROM DOCTORS WHERE department = ?";
    public static final String POSITIONQUERY = "SELECT * FROM DOCTORS WHERE doctor_position = ?";
    public static final String IDQUERY = "SELECT * FROM DOCTORS WHERE doctor_id = ?";
}
