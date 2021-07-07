package com.ducon.daelimpick.user;

// 인터페이스랑 구현체랑 같은 패키지에 있는 것이 별로라고 한다.
public interface UserRepository {
    void save(User user);

    User findById(String userId);
}
