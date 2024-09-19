package com.unlimited_dream.demo.controller;

import com.unlimited_dream.demo.dto.UserDto;
import com.unlimited_dream.demo.exception.CustomException;
import com.unlimited_dream.demo.exception.ErrorMessage;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
public class Controller {

    @PostMapping
    public String addUser(@RequestBody @Valid UserDto userDto) {
        System.out.println("Valid successfully");
        return "Valid successfully";
    }

    @GetMapping("/bad_request")
    public String throwBadRequest() {
        throw new CustomException(HttpStatus.BAD_REQUEST, ErrorMessage.BAD_REQUEST);
    }

    @GetMapping("/not_found")
    public String throw_not_found() {
        throw new CustomException(HttpStatus.NOT_FOUND, ErrorMessage.NOT_FOUND);
    }

}