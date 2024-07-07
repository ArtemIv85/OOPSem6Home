package homework.Service;

import homework.Model.Persister;
import homework.Model.User;

public class PersisterService {


    public static void save(User user){
        Persister persister = new Persister(user);
        System.out.println("Save user: " + persister.getUser().getName());
    }
}
