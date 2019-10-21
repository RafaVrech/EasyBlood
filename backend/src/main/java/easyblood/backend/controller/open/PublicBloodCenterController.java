package easyblood.backend.controller.open;

import easyblood.backend.service.BloodCenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public/bloodcenter")
public class PublicBloodCenterController {
    @Autowired
    BloodCenterService bloodCenterService;
    @GetMapping
    public ResponseEntity getBloodCentersByBloodType(){
        return ResponseEntity.ok(bloodCenterService.getBloodCentersByBloodType());
    }
}

