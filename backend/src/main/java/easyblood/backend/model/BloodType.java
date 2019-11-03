package easyblood.backend.model;

import lombok.ToString;

@ToString
public enum BloodType {
    APositive("A+"),
    ANegative("A-"),
    BPositive("B+"),
    BNegative("B-"),
    OPositive("O+"),
    ONegative("O-");

    private String type;

    BloodType(String type) {
        this.type = type;
    }
}
