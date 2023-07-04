package ru.inno.library.services;

import ru.inno.library.dto.UserForm;
import ru.inno.library.models.User;

import java.util.List;

public interface UsersService {
    List<User> getAllUsers();

    void addUser(UserForm user);

    User getUser(Long id);

    void updateUser(Long userId, UserForm user);

    void deleteUser(Long userId);
}