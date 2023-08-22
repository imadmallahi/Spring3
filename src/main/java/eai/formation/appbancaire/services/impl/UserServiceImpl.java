package eai.formation.appbancaire.services.impl;

import eai.formation.appbancaire.entities.User;
import eai.formation.appbancaire.repositories.UserRepository;
import eai.formation.appbancaire.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {


    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User AddUser(User user) {

        return userRepository.save(user);
    }

    @Override
    public List<User> getUsers() {
        return null;
    }


}
