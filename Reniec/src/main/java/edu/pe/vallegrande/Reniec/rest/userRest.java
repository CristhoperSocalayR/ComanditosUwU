package edu.pe.vallegrande.Reniec.rest;


import edu.pe.vallegrande.Reniec.model.User;
import edu.pe.vallegrande.Reniec.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/users")
public class userRest  {

    @Autowired
    private UserService userService;

    @GetMapping("/{dni}")
    public Mono<User> getUserByDni(@PathVariable String dni) {
        return userService.getUserByDni(dni);
    }

    @PostMapping
    public Mono<User> createUser(@RequestBody User newUser) {
        return userService.createUser(newUser);
    }

}