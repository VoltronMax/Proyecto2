package Model;
import Enums.Roles;

public class Standar extends User{

    Standar(String name, Integer numId, String username, String password, Roles role) {
        super(name, numId, username, password, role);
    }
}
