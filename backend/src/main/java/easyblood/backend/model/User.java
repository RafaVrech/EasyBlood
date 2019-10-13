package easyblood.backend.model;

import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    @Transient
    private String passwordConfirm;

//    private List<Role> roles;

}
