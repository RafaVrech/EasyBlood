package easyblood.backend.service;

import easyblood.backend.model.BloodCenter;

public interface BloodCenterService {
    Iterable<BloodCenter> getBloodCentersByBloodType();
}
