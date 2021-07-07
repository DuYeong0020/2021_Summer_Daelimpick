package com.ducon.daelimpick.user;

public interface UserService {
    void join(User user);

    User findUser(String userId);
}
