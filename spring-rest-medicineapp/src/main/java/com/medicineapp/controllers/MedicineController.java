package com.medicineapp.controllers;

import com.medicineapp.model.Medicine;
import com.medicineapp.service.IMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicine-api")
public class MedicineController {
    @Autowired
    IMedicineService medicineService;

    @PostMapping("/medicines")
    public ResponseEntity<Medicine> addMedicine(@RequestBody Medicine medicine) {
        Medicine medicine1 = medicineService.addMedicine(medicine);
        return ResponseEntity.status(HttpStatus.CREATED).body(medicine1);
    }

    @DeleteMapping("/medicines/medicine-id/{medicineId}")
    public ResponseEntity<Void> deleteMedicine(@PathVariable("medicineId") int medicineId) {
        medicineService.deleteMedicine(medicineId);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("/medicines")
    public ResponseEntity<Void> updateMedicine(@RequestBody Medicine medicine) {
        medicineService.updateMedicine(medicine);
        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @GetMapping("/medicines/medicine-id/{medicineId}")
    public ResponseEntity<Medicine> getById(@PathVariable("medicineId") int medicineId) {
        Medicine medicine = medicineService.getById(medicineId);
        return ResponseEntity.ok(medicine);
    }

    @GetMapping("/medicines")
    public ResponseEntity<List<Medicine>> showAll() {
        List<Medicine> medicines = medicineService.getAll();
        return ResponseEntity.ok(medicines);
    }

    @GetMapping("/medicines/medicineName/{medicineName}")
    public ResponseEntity<Medicine> getByMedicineName(@PathVariable("medicineName") String medicineName) {
        Medicine medicine = medicineService.getByMedicineNameLike(medicineName);
        return ResponseEntity.ok(medicine);
    }

    @GetMapping("/medicines/brand/{brand}")
    public ResponseEntity<List<Medicine>> getByBrand(@PathVariable("brand") String brand) {
        List<Medicine> medicines = medicineService.getByBrand(brand);
        return ResponseEntity.ok(medicines);
    }

    @GetMapping("/medicines/category/{category}")
    public ResponseEntity<List<Medicine>> getByCategory(@PathVariable("category") String category) {
        List<Medicine> medicines =  medicineService.getByCategory(category);
        return ResponseEntity.ok(medicines);
    }

    @GetMapping("/medicines/consumeType/{consumeType}")
    public ResponseEntity<List<Medicine>> getByConsumeType(@PathVariable("consumeType") String consumeType){
        List<Medicine> medicines =  medicineService.getByConsumeType(consumeType);
        return ResponseEntity.ok(medicines);
    }

    @GetMapping("/medicines/packSize/{packSize}")
    public ResponseEntity<List<Medicine>> getByPackSize(@PathVariable("packSize") String packSize){
        List<Medicine> medicines =  medicineService.getByPackSize(packSize);
        return ResponseEntity.ok(medicines);
    }

    @GetMapping("/medicines/flavour/{flavour}")
    public ResponseEntity<List<Medicine>> getByFlavour(@PathVariable("flavour") String flavour){
        List<Medicine> medicines =  medicineService.getByFlavour(flavour);
        return ResponseEntity.ok(medicines);
    }

    @GetMapping("/medicines/manufacturer/{manufacturer}")
    public ResponseEntity<List<Medicine>> getByManufacturer(@PathVariable("manufacturer") String manufacturer){
        List<Medicine> medicines =  medicineService.getByManufacturer(manufacturer);
        return ResponseEntity.ok(medicines);
    }

    @GetMapping("/medicines/price/{price}")
    public ResponseEntity<List<Medicine>> getByPriceLessThan(@PathVariable("price") double price){
        List<Medicine> medicines =  medicineService.getByPriceLessThan(price);
        return ResponseEntity.ok(medicines);
    }

    @GetMapping("/medicines/category/{category}/brand/{brand}")
    public ResponseEntity<List<Medicine>> getByCategoryAndBrand(@PathVariable("category") String category,@PathVariable("brand") String brand){
        List<Medicine> medicines =  medicineService.getByCategoryAndBrand(category, brand);
        return ResponseEntity.ok(medicines);
    }

    @GetMapping("/medicines/category/{category}/price/{price}")
    public ResponseEntity<List<Medicine>> getByCategoryAndPriceLessThan(@PathVariable("category") String category,@PathVariable("price") double price){
        List<Medicine> medicines =  medicineService.getByCategoryAndPriceLessThan(category, price);
        return ResponseEntity.ok(medicines);
    }

    @GetMapping("/medicines/manufacturer/{manufacturer}/category/{category}")
    public ResponseEntity<List<Medicine>> getByManufacturerAndCategory(@PathVariable("manufacturer") String manufacturer,@PathVariable("category") String category){
        List<Medicine> medicines =  medicineService.getByManufacturerAndCategory(manufacturer, category);
        return ResponseEntity.ok(medicines);
    }

    @GetMapping("/medicines/category/{category}/medicineName/{medicineName}")
    public ResponseEntity<List<Medicine>> getByCategoryAndMedicineName(@PathVariable("category") String category,@PathVariable("medicineName") String medicineName){
        List<Medicine> medicines =  medicineService.getByCategoryAndMedicineNameLike(category, medicineName);
        return ResponseEntity.ok(medicines);
    }

}
