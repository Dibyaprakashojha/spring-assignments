package com.hospitalapp.model;

public class Doctor {
    private Integer doctorId;
    private String doctorName;
    private String department;
    private Integer availability;
    private String doctorPosition;
    private Integer fees;

    public Doctor() {
        super();
    }

    public Doctor(Integer doctorId, String doctorName, String department, Integer availability, String doctorPosition, Integer fees) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.department = department;
        this.availability = availability;
        this.doctorPosition = doctorPosition;
        this.fees = fees;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Integer getAvailability() {
        return availability;
    }

    public void setAvailability(Integer availability) {
        this.availability = availability;
    }

    public String getDoctorPosition() {
        return doctorPosition;
    }

    public void setDoctorPosition(String doctorPosition) {
        this.doctorPosition = doctorPosition;
    }

    public Integer getFees() {
        return fees;
    }

    public void setFees(Integer fees) {
        this.fees = fees;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId='" + doctorId + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", department='" + department + '\'' +
                ", availability=" + availability +
                ", doctorPosition='" + doctorPosition + '\'' +
                ", fees=" + fees +
                '}';
    }
}
