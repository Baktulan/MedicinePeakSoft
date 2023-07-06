package service;

import models.Pharmacy;
import models.Worker;

public interface ServiceInterface {
    Pharmacy getPharmacyByWorkerName(String worker);
    void addWorkerToPharmacy(Long pharmacyId, Worker worker);
}
