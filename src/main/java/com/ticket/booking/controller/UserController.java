package com.ticket.booking.controllers;

import com.ticket.booking.dto.UserDto;
import com.ticket.booking.entities.User;
import com.ticket.booking.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Create a new user
    @PostMapping
    public ResponseEntity<?> createUser(@Valid @RequestBody UserDto userDto, BindingResult bindingResult) {
        UserDto createdUser = userService.addUser(userDto);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

}