package easyblood.backend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "requests")
public class Request {

    @Id
    private String id;

    private String inNeed;

    private String requested;

    private BloodType bloodType;

    private String liters;
}
