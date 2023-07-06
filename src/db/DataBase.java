package db;

import models.Medicine;
import models.Pharmacy;
import models.Worker;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private List<Pharmacy>pharmacies=new ArrayList<>();
    private List<Medicine>medicines= new ArrayList<>();
    private List<Worker>workers= new ArrayList<>();

    public DataBase(List<Pharmacy> pharmacies, List<Medicine> medicines, List<Worker> workers) {
        this.pharmacies = pharmacies;
        this.medicines = medicines;
        this.workers = workers;
    }

    public List<Pharmacy> getPharmacies() {
        return pharmacies;
    }

    public void setPharmacies(List<Pharmacy> pharmacies) {
        this.pharmacies = pharmacies;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<Medicine> medicines) {
        this.medicines = medicines;
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public void setWorkers(List<Worker> workers) {
        this.workers = workers;
    }
}
