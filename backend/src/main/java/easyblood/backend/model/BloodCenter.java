package easyblood.backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;

@Data
@Document(collection = "bloodcenters")
public class BloodCenter {
    @Id
    private String id;

    @NotEmpty
    private String name;

    private int bloodLiters;
}
