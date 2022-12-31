package ua.edu.ucu.demo.User;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    private UserRepository userrepository;
    public List<AppUsser> getUsers(){
        return userrepository.findAll();
    }

    public void addUsser(AppUsser user){
        if (userrepository.findAppUsserByEmail(user.getEmail()).isEmpty()) {
            userrepository.save(user);
        }
    }
}
