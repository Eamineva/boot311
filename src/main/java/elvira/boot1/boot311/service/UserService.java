package elvira.boot1.boot311.service;

import elvira.boot1.boot311.model.User;


import java.util.List;

public interface UserService {
    void add(User user);
    void updUser(long id, User user);
    void delUser(long id);
    List<User> listUsers();
    public User show(long id);

}

