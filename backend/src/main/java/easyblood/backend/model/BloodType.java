package easyblood.backend.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.ToString;

@ToString
@JsonFormat
public enum BloodType {
    APositive("A+"),
    ANegative("A-"),
    BPositive("B+"),
    BNegative("B-"),
    ABNegative("AB-"),
    ABPositive("AB+"),
    OPositive("O+"),
    ONegative("O-");

    private String type;

    BloodType(String type) {
        this.type = type;
    }

    @JsonValue
    public String getType() {
        return type;
    }

    @JsonCreator
    public static BloodType fromValue(String value) {
        switch (value) {
            case "A+":
                return APositive;
            case "A-":
                return ANegative;
            case "B+":
                return BPositive;
            case "B-":
                return BNegative;
            case "AB-":
                return ABNegative;
            case "AB+":
                return ABPositive;
            case "O+":
                return OPositive;
            case "O-":
                return ONegative;
        }
        return null;
    }
}
