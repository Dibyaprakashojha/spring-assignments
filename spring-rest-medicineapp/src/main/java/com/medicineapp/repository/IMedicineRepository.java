package com.medicineapp.repository;

import com.medicineapp.model.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMedicineRepository extends JpaRepository<Medicine,Integer> {
    Medicine findByMedicineNameLike(String medicineName);
    List<Medicine> findByBrand(String brand);
    List<Medicine> findByCategory(String category);
    List<Medicine> findByConsumeType(String consumeType);
    List<Medicine> findByPackSize(String packSize);
    List<Medicine> findByFlavour(String flavour);
    List<Medicine> findByManufacturer(String manufacturer);
    List<Medicine> findByPriceLessThan(double price);

    List<Medicine> findByCategoryAndBrand(String category,String brand);
    List<Medicine> findByCategoryAndPriceLessThan(String category,double price);
    List<Medicine> findByManufacturerAndCategory(String manufacturer,String category);
    List<Medicine> findByCategoryAndMedicineName(String category,String medicineName);
}
