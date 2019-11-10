package easyblood.backend.model;

import lombok.Data;
import lombok.ToString;

@ToString
@Data
public enum BloodType {
    APositive("A+"),
    ANegative("A-"),
    BPositive("B+"),
    BNegative("B-"),
    ABNegative("AB-"),
    ABPositive("AB-"),
    OPositive("O+"),
    ONegative("O-");

    private String type;

    BloodType(String type) {
        this.type = type;
    }
}
