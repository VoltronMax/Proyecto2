package Model;
import Interface.AdminPerms;
import Enums.Roles;

public class Admin extends User implements AdminPerms {

    Admin(String name, Integer numId, String username, String password, Roles role, String[]logs) {
        super(name, numId, username, password, Roles.ADMINISTRADOR, logs);
    }

    @Override
    public void addInfo() {

    }

    @Override
    public void deleteInfo() {

    }

    @Override
    public void updateInfo() {
    }

}
