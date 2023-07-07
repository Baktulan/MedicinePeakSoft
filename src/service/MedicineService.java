package service;

import models.Medicine;

import java.util.List;

public interface MedicineService {
    List<Medicine>getallMedicineByPharmacy(String pharmacyName);
    void addMedicineToPharmacy(Long pharmacyId, Medicine medicine);
    void updateMedicinePrice(Long pharmacyId,Long medicineId,int price);
    void  deleteMedicineByName(Long pharmacyId,String medicineName);
}
