package med.voll.api.doctor;

public record ListingDoctorData(String name, String email, String crm, Specialty specialty) {

    public ListingDoctorData(Doctor doctor) {
        this(doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getSpecialty());
    }

}
