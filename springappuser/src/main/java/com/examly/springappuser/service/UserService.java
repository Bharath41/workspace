package main.java.com.examly.springappuser.service;

import com.examly.springappuser.model.LoginDTO;
import com.examly.springappuser.model.User;

public interface UserService {
    void registerUser(User user) throws Exception;

    String authenticateUser(LoginDTO loginDTO) throws Exception;
}
