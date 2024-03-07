package med.voll.api.patient;

import med.voll.api.address.AddressData;

public record CreatePatientData(
        String name,
        String email,
        String phone,
        String CPF,
        AddressData address
) {
}
