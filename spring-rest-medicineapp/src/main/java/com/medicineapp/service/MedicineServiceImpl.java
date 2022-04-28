package com.medicineapp.service;

import com.medicineapp.exceptions.MedicineNotFoundException;
import com.medicineapp.model.Medicine;
import com.medicineapp.repository.IMedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MedicineServiceImpl implements IMedicineService{
    @Autowired
    IMedicineRepository medicineRepository;

    @Override
    public Medicine addMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    @Override
    public void updateMedicine(Medicine medicine) {
        medicineRepository.save(medicine);
    }

    @Override
    public void deleteMedicine(int medicineId) {
        medicineRepository.deleteById(medicineId);
    }

    @Override
    public Medicine getById(int medicineId) {
        return medicineRepository.findById(medicineId).get();
    }

    @Override
    public List<Medicine> getAll() {
        return medicineRepository.findAll();
    }

    @Override
    public Medicine getByMedicineNameLike(String medicineName) {
        Medicine medicine = medicineRepository.findByMedicineNameLike(medicineName);
        if(medicine!=null)
            return medicine;
        throw new MedicineNotFoundException("Medicine Not Found");
    }

    @Override
    public List<Medicine> getByBrand(String brand) {
        List<Medicine> medicines = medicineRepository.findByBrand(brand);
        if(medicines.isEmpty())
            throw new MedicineNotFoundException("Medicine Not Found");
        return medicines;
    }

    @Override
    public List<Medicine> getByCategory(String category) {
        List<Medicine> medicines = medicineRepository.findByCategory(category);
        if(medicines.isEmpty())
            throw new MedicineNotFoundException("Medicine Not Found");
        return medicines;
    }

    @Override
    public List<Medicine> getByConsumeType(String consumeType) {
        List<Medicine> medicines = medicineRepository.findByConsumeType(consumeType);
        if(medicines.isEmpty())
            throw new MedicineNotFoundException("Medicine Not Found");
        return medicines;
    }

    @Override
    public List<Medicine> getByPackSize(String packSize) {
        List<Medicine> medicines = medicineRepository.findByPackSize(packSize);
        if(medicines.isEmpty())
            throw new MedicineNotFoundException("Medicine Not Found");
        return medicines;
    }

    @Override
    public List<Medicine> getByFlavour(String flavour) {
        List<Medicine> medicines = medicineRepository.findByFlavour(flavour);
        if(medicines.isEmpty())
            throw new MedicineNotFoundException("Medicine Not Found");
        return medicines;
    }

    @Override
    public List<Medicine> getByManufacturer(String manufacturer) {
        List<Medicine> medicines = medicineRepository.findByManufacturer(manufacturer);
        if(medicines.isEmpty())
            throw new MedicineNotFoundException("Medicine Not Found");
        return medicines;
    }

    @Override
    public List<Medicine> getByPriceLessThan(double price) {
        List<Medicine> medicines = medicineRepository.findByPriceLessThan(price);
        if(medicines.isEmpty())
            throw new MedicineNotFoundException("Medicine Not Found");
        return medicines;
    }

    @Override
    public List<Medicine> getByCategoryAndBrand(String category, String brand) {
        List<Medicine> medicines = medicineRepository.findByCategoryAndBrand(category, brand);
        if(medicines.isEmpty())
            throw new MedicineNotFoundException("Medicine Not Found");
        return medicines;
    }

    @Override
    public List<Medicine> getByCategoryAndPriceLessThan(String category, double price) {
        List<Medicine> medicines = medicineRepository.findByCategoryAndPriceLessThan(category, price);
        if(medicines.isEmpty())
            throw new MedicineNotFoundException("Medicine Not Found");
        return medicines;
    }

    @Override
    public List<Medicine> getByManufacturerAndCategory(String manufacturer, String category) {
        List<Medicine> medicines = medicineRepository.findByManufacturerAndCategory(manufacturer, category);
        if(medicines.isEmpty())
            throw new MedicineNotFoundException("Medicine Not Found");
        return medicines;
    }

    @Override
    public List<Medicine> getByCategoryAndMedicineNameLike(String category, String medicineName) {
        List<Medicine> medicines = medicineRepository.findByCategoryAndMedicineName(category, medicineName);
        if(medicines.isEmpty())
            throw new MedicineNotFoundException("Medicine Not Found");
        return medicines;
    }
}
