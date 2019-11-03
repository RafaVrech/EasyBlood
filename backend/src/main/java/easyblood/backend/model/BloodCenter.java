package easyblood.backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
@Document(collection = "bloodcenters")
public class BloodCenter {
    @Id
    private String id;

    @NotEmpty
    private String name;

    private List<Blood> bloodList;

    private Address address;
}
