package easyblood.backend.service;

import easyblood.backend.model.BloodCenter;
import easyblood.backend.repository.BloodCenterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BloodCenterServiceImpl implements BloodCenterService{

    @Autowired
    BloodCenterRepository bloodCenterRepository;

    public Iterable<BloodCenter> getBloodCentersByBloodType(){
        return bloodCenterRepository.findAll();
    }
}
