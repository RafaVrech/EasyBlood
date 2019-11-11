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
    ABPositive("AB-"),
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
        return BloodType.valueOf(value);
    }
}
