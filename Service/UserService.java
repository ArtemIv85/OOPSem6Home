package homework.Service;

import homework.Model.Persister;
import homework.Model.User;

public class UserService {
    public static User CreateUser(String name){
        User user = new User(name);
        return user;
    }

    public static void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }





}
