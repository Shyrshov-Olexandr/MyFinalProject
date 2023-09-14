package myfinalproject.controllers;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import myfinalproject.dao.UserDAO;
import myfinalproject.services.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Api(value = "Get users")
@RestController
@AllArgsConstructor
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private JwtService jwtService;
    @Autowired
    private UserDAO userDAO;

    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("hello from security");
    }
}