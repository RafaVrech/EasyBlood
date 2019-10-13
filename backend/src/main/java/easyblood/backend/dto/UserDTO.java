package easyblood.backend.dto;

import com.fasterxml.jackson.annotation.JsonView;
import easyblood.backend.model.JsonViews;
import lombok.Data;

@Data
public class UserDTO {

    private String id;

    private String username;

    @JsonView(JsonViews.ManagerView.class)
    private String password;
}
