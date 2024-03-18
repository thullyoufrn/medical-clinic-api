package med.voll.api.patient;

public record ListingPatientData(String name, String email, String phone, String CPF) {

    public ListingPatientData(Patient patient) {
        this(patient.getName(), patient.getEmail(), patient.getPhone(), patient.getCPF());
    }

}
