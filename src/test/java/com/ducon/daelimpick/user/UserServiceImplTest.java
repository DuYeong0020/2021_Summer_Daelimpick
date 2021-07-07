package com.ducon.daelimpick.user;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceImplTest {

    UserRepository userRepository =  new UserMemoryRepository();
    UserService userService = new UserServiceImpl(userRepository);


    @Test
    void join() {
        // given
        User user1 = new User("id111","dudu","df5f", "2021.10.15");
        // when
        userService.join(user1);
        User user2 = userService.findUser("id111");
        // then
        assertThat(user1).isEqualTo(user2);
    }
}