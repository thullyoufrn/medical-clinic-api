package med.voll.api.address;

public record AddressData(
        String street,
        String neighborhood,
        String zipCode,
        String number,
        String complement,
        String city,
        String state
) {
}
