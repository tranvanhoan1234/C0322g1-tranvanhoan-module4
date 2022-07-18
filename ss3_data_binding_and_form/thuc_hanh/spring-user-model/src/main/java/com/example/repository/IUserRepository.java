package com.example.repository;

import com.example.modle.Login;
import com.example.modle.User;

public interface IUserRepository  {
     static User checkLogin(Login login) {
          return checkLogin(login);
     }
}
