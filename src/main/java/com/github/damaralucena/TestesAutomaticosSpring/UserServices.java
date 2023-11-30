package com.github.damaralucena.TestesAutomaticosSpring;

import com.github.damaralucena.TestesAutomaticosSpring.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {
  List<User> users = new ArrayList<>();
  public List<User> create(User user){
    users.add(user);

    return users;

  }
}
