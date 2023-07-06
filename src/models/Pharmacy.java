package models;

import java.util.List;
import java.util.concurrent.ForkJoinWorkerThread;

public class Pharmacy {
    private Long id;
    private String name;
    private String address;
    private List<Medicine>medicines;
    private List<Worker>workers;

}
