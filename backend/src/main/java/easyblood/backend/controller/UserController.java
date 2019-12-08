package easyblood.backend.controller;

import easyblood.backend.dto.UserDTO;
import easyblood.backend.model.User;
import easyblood.backend.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/users")
@Api(value = "User")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity login(Authentication authentication) {
        return ResponseEntity.ok(userService.findByUsername(authentication.getName()));
    }

    @GetMapping("/{cpf}")
    public ResponseEntity getByCPF(@PathVariable String cpf) {
        User byCpf = userService.findByCpf(cpf);
        if(byCpf == null)
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        return ResponseEntity.ok(byCpf);
    }

    @PatchMapping("/{cpf}")
    public ResponseEntity editaPorCpf(@PathVariable String cpf, @RequestBody UserDTO userDTO) {
        User byCpf = userService.findByCpf(cpf);
        if(byCpf == null)
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        boolean success = userService.update(userDTO.toUser(byCpf));
        return success ? ResponseEntity.ok(userDTO.toUser(byCpf)) : ResponseEntity.status(HttpStatus.NOT_MODIFIED).build();
    }
}