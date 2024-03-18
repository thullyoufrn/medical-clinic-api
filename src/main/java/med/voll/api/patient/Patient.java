package med.voll.api.patient;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.address.Address;

@Table(name = "patients")
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String CPF;

    @Embedded
    private Address address;

    public Patient(CreatePatientData data) {
        this.name = data.name();
        this.email = data.email();
        this.phone = data.phone();
        this.CPF = data.CPF();
        this.address = new Address(data.address());
    }

}
