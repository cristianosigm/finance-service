package com.csc.finance.api.v1;

import com.csc.finance.api.dto.UserDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import jakarta.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Api("Users API")
@RequestMapping(value = "/api/user")
public interface UserResource {

    @ApiOperation(
            value = "Create or update an user",
            notes = "Create a new user, if the received entity has a null ID, or updates the values otherwise.")
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity save(@Valid @RequestBody UserDTO user);

    @ApiOperation(
            value = "Get all existing users",
            notes = "Return all existing users in the database, regardless of their statuses.")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    List<UserDTO> getAll();

}
