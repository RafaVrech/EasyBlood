package easyblood.backend.model;

import lombok.Data;

@Data
public class Address {

    private String street;
    private String state;
    private String number;
    private long longitude;
    private long latitude;
}
