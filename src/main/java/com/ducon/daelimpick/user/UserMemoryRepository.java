package com.ducon.daelimpick.user;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserMemoryRepository implements UserRepository {
    private static Map<String, User> store = new HashMap<>();

    @Override
    public void save(User user) {
        store.put(user.getUserId(), user);
    }

    @Override
    public User findById(String userId) {
        return store.get(userId);
    }
}
