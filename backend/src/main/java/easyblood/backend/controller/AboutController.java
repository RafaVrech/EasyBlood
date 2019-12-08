package easyblood.backend.controller;

import easyblood.backend.service.AboutService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about")
@Api(value = "About")
public class AboutController {

    @Autowired
    private AboutService aboutService;

}
