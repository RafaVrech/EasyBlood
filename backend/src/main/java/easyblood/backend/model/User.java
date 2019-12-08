package easyblood.backend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;

@Data
@Document(collection = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    private String id;

    @NotEmpty(message = "Nome de usuario vazio")
    private String username;

    @NotEmpty(message = "Senha vazia")
    private String password;

    @Transient
    private String passwordConfirm;

    private List<String> roles;

    @Indexed(unique=true)
    private String cpf;

    private String name;

    private Date birthDate;

    private String sex;

    private String email;

    private String phone;

    private String bloodType;

    private String report;

    private boolean eligibleDonor;

    private Address address;
}
