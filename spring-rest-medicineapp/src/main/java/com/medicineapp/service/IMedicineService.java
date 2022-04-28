package com.medicineapp.service;

import com.medicineapp.exceptions.MedicineNotFoundException;
import com.medicineapp.model.Medicine;

import java.util.List;

public interface IMedicineService {
    Medicine addMedicine(Medicine medicine);
    void updateMedicine(Medicine medicine);
    void deleteMedicine(int medicineId);
    Medicine getById(int medicineId);
    List<Medicine> getAll();

    Medicine getByMedicineNameLike(String medicineName) throws MedicineNotFoundException;
    List<Medicine> getByBrand(String brand) throws MedicineNotFoundException;
    List<Medicine> getByCategory(String category) throws MedicineNotFoundException;
    List<Medicine> getByConsumeType(String consumeType) throws MedicineNotFoundException;
    List<Medicine> getByPackSize(String packSize) throws MedicineNotFoundException;
    List<Medicine> getByFlavour(String flavour) throws MedicineNotFoundException;
    List<Medicine> getByManufacturer(String manufacturer) throws MedicineNotFoundException;
    List<Medicine> getByPriceLessThan(double price) throws MedicineNotFoundException;
    List<Medicine> getByCategoryAndBrand(String category,String brand) throws MedicineNotFoundException;
    List<Medicine> getByCategoryAndPriceLessThan(String category,double price) throws MedicineNotFoundException;
    List<Medicine> getByManufacturerAndCategory(String manufacturer,String category) throws MedicineNotFoundException;
    List<Medicine> getByCategoryAndMedicineNameLike(String category, String medicineName) throws MedicineNotFoundException;

}
