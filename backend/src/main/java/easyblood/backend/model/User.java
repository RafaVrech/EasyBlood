package easyblood.backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Document(collection = "users")
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
}
