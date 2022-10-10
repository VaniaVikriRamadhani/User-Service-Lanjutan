/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.vania.user.service.service;

import com.vania.user.service.dto.User;
import java.util.List;


/**
 *
 * @author HP
 */
public interface UserService {
    
    public List<User> getAllUsers();

    public User getUser(String id);

    public void addUser(User user); 
    
    public User updateUser(User user);

    public User deleteUser(String id);

}
