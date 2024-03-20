package med.voll.api.address;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private String street;
    private String neighborhood;
    private String zipCode;
    private String number;
    private String complement;
    private String city;
    private String state;

    public Address(AddressData data) {
        this.street = data.street();
        this.neighborhood = data.neighborhood();
        this.zipCode = data.zipCode();
        this.number = data.number();
        this.complement = data.complement();
        this.city = data.city();
        this.state = data.state();
    }

    public void update(AddressData data) {
        if(data.street() != null) {
            this.street = data.street();
        }
        if(data.neighborhood() != null) {
            this.street = data.neighborhood();
        }
        if(data.zipCode() != null) {
            this.street = data.zipCode();
        }
        if(data.number() != null) {
            this.street = data.number();
        }
        if(data.complement() != null) {
            this.street = data.complement();
        }
        if(data.city() != null) {
            this.street = data.city();
        }
        if(data.state() != null) {
            this.street = data.state();
        }
    }
}
