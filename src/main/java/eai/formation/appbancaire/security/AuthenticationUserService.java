package eai.formation.appbancaire.security;

import eai.formation.appbancaire.repositories.UserRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationUserService implements UserDetailsService {

    private final UserRepository userRepository;

    public AuthenticationUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        eai.formation.appbancaire.entities.User users = userRepository.findByUsername(username);
        if (users == null) {
            throw new UsernameNotFoundException(username);
        }
        User.UserBuilder builder= org.springframework.security.core.userdetails.User
                .withUsername(username);
        builder.password(users.getPassword());
        builder.roles(users.getRole());
        return builder.build();
    }
}

