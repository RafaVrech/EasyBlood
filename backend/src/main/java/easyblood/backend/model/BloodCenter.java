package easyblood.backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Document(collection = "bloodcenters")
public class BloodCenter {
    @Id
    private String id;

    @NotEmpty
    @Indexed(unique=true)
    private String name;

    private List<Blood> bloodList;

    private Address address;

    private String imageURL;

    private User user;

    private String requirements;
}
