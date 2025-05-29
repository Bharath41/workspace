package main.java.com.examly.springappuser.controller;

import com.examly.springappuser.model.LoginDTO;
import com.examly.springappuser.model.User;
import com.examly.springappuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        String response = userService.registerUser(user);
        Map<String, String> result = new HashMap<>();
        result.put("message", response);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDTO loginDTO) {
        String token = userService.loginUser(loginDTO);
        Map<String, String> result = new HashMap<>();
        result.put("token", token);
        return ResponseEntity.ok(result);
    }
}
