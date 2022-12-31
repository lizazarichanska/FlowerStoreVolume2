package ua.edu.ucu.demo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {
    private final UserService userservice;
    @Autowired
    public UserController(UserService userservice){
        this.userservice = userservice;
    }

    @GetMapping
    public List<AppUsser> getUsers(){
        return userservice.getUsers();
    }
    @PostMapping
    public void addUser(@RequestBody AppUsser user){
        userservice.addUsser(user);
    }

}

