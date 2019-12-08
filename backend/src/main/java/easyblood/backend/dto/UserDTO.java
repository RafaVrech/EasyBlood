package easyblood.backend.dto;

import easyblood.backend.model.User;
import lombok.Data;

@Data
public class UserDTO {

    private String name;

    private String cpf;

    private String bloodType;

    private String sex;

    private String report;

    private String username;

    public User toUser(User user) {
        user.setUsername(this.getUsername());
        user.setBloodType(this.getBloodType());
        user.setCpf(this.getCpf());
        user.setName(this.getName());
        user.setReport(this.getReport());
        user.setSex(this.getSex());
        return user;
    }
}
