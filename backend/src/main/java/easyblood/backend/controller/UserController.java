package easyblood.backend.controller;

import easyblood.backend.dto.UserDTO;
import easyblood.backend.service.SecurityService;
import easyblood.backend.service.UserService;
import easyblood.backend.validator.UserValidator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(value = "User")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private SecurityService securityService;

    @Autowired
    private UserValidator userValidator;

    @ApiOperation(value = "Get a user", response = UserDTO.class)
    @ApiResponse(code = 200, message = "OK", response = UserDTO.class)
    @GetMapping("/registration")
    public UserDTO registration(String model) {
        int length = model.length();

        return new UserDTO();
    }
//
//    @PostMapping("/registration")
//    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
//        userValidator.validate(userForm, bindingResult);
//
//        if (bindingResult.hasErrors()) {
//            return "registration";
//        }
//
//        userService.save(userForm);
//
//        securityService.autoLogin(userForm.getUsername(), userForm.getPasswordConfirm());
//
//        return "redirect:/welcome";
//    }
//
//    @GetMapping("/login")
//    public String login(Model model, String error, String logout) {
//        if (error != null)
//            model.addAttribute("error", "Your username and password is invalid.");
//
//        if (logout != null)
//            model.addAttribute("message", "You have been logged out successfully.");
//
//        return "login";
//    }
//
//    @GetMapping({"/", "/welcome"})
//    public String welcome(Model model) {
//        return "welcome";
//    }
}