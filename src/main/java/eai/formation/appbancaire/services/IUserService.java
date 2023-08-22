package eai.formation.appbancaire.services;

import eai.formation.appbancaire.entities.User;

import java.util.List;

public interface IUserService {

    User AddUser(User user);
    List<User> getUsers();
}
