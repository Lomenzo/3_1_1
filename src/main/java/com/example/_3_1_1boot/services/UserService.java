package com.example._3_1_1boot.services;
import com.example._3_1_1boot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    // Save operation
    User saveUser(User user);

    // Read operation
    List<User> getUserList();

//    // Update operation
//    User updateUser(User user,
//                                Long userId);
//
//    // Delete operation
//    void deleteUserById(Long userId);

}
