package easyblood.backend.controller;

import easyblood.backend.model.User;
import easyblood.backend.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/users")
@Api(value = "User")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    @ApiOperation(value = "Register a new user", response = ResponseEntity.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Created",
                    responseHeaders = @ResponseHeader(response = URI.class, name = "location", description = "Location to created user (/user/{id])")),
            @ApiResponse(code = 409, message = "Conflict") })

    public ResponseEntity registration(@RequestBody User user) {
        if(userService.findByUsername(user.getUsername()) != null ||
            !user.getPassword().equals(user.getPasswordConfirm()) ||
            !userService.save(user))
            return ResponseEntity.status(HttpStatus.CONFLICT).build();

        return ResponseEntity.created(URI.create(String.format("/user/%s", user.getId()))).build();
    }

    @PostMapping("/login")
    public ResponseEntity login(Authentication authentication) {
        return ResponseEntity.ok(userService.findByUsername(authentication.getName()));
    }
}