package med.voll.api.doctor;

public record ListingDoctorData(Long id, String name, String email, String crm, Specialty specialty) {

    public ListingDoctorData(Doctor doctor) {
        this(doctor.getId(), doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getSpecialty());
    }

}
