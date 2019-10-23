package easyblood.backend.controller;

import easyblood.backend.model.User;
import easyblood.backend.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/users")
@Api(value = "User")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "Register a new user", response = ResponseEntity.class)
    @ApiResponse(code = 200, message = "OK")
    @PostMapping
    public ResponseEntity registration(@RequestBody User user) {
        if(!userService.save(user))
            return ResponseEntity.status(HttpStatus.CONFLICT).build();

        return ResponseEntity.created(URI.create(String.format("/user/%s", user.getId()))).build();
    }

    @PostMapping("/login")
    public ResponseEntity login() {
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity retornarTodos() {
        return ResponseEntity.ok(userService.todos());
    }


}