package homework.Controller;

import homework.Model.User;
import homework.Service.PersisterService;
import homework.Service.UserService;

public class Controller {


    public static User CreateUser(String name){
        return  UserService.CreateUser(name);
    }

    public static void start(){

        User Alex = CreateUser("Bob");
        UserService.report(Alex);
        PersisterService.save(Alex);

    }

}
