class Patient {
    
    private int patientId;


    protected String disease;


    public Patient(int patientId, String disease) {
        this.patientId = patientId;
        this.disease = disease;
    }


    public int getPatientId() {
        return patientId;
    }


    public void getDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Disease: " + disease);
    }
}

class DoctorAccess extends Patient {

    public DoctorAccess(int patientId, String disease) {
        super(patientId, disease);
    }

    public void viewPatientInfo() {
        System.out.println("Patient ID (via method): " + getPatientId());
        System.out.println("Disease (direct access): " + disease);
    }
}
public class HospitalSystem {
    public static void main(String[] args) {
        DoctorAccess doc = new DoctorAccess(101, "Flu");

        System.out.println("Doctor accessing patient info:");
        doc.viewPatientInfo();
    }
}
