package com.github.damaralucena.TestesAutomaticosSpring;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;

public class UserServiceTest  {
  private UserServices userServices = new UserServices();

  @Test
  public void createUser_ReturnsUsers(){

    User user = new User("DamaraLucena", "123456");

    List<User> users = userServices.create(user);

    assertEquals(1, users.size());
    assertEquals(user, users.get(0));

  }

  @Test
  public void createUser_ThrowsException() {
    User user = new User("DamaraLucena", "123456");
    userServices.create(user);

    assertThrows(RuntimeException.class,
      () -> userServices.create(user));
  }

}
