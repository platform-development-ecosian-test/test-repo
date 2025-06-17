// package com.example.demo.api;

// import com.example.demo.entity.User;
// import com.example.demo.service.UserService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;
// import java.util.Optional;

// @RestController
// @RequestMapping("/api")
// public class ApiController {
    
//     @Autowired
//     private UserService userService;
    
//     @GetMapping("/users")
//     public List<User> getAllUsers() {
//         return userService.getAllUsers();
//     }
    
//     @GetMapping("/users/{id}")
//     public Optional<User> getUserById(@PathVariable Long id) {
//         return userService.getUserById(id);
//     }
    
//     @GetMapping("/users/name/{name}")
//     public User getUserByName(@PathVariable String name) {
//         return userService.getUserByName(name);
//     }
    
//     @GetMapping("/users/email/{email}")
//     public User getUserByEmail(@PathVariable String email) {
//         return userService.getUserByEmail(email);
//     }
// }
