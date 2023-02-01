package ru.kata.spring.bootstrap.service;

import ru.kata.spring.bootstrap.model.Role;

import java.util.Set;

public interface RoleService {
    void createRoles(Set<Role> roles);
    Set<Role> getAllRoles();
}
