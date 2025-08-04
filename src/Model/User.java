package Model;
import Enums.Roles;

public abstract class User {

    //POJO

    private Register[]registros;
    private String name;
    private Integer numId;
    private String username;
    private String password;

    User(String name, Integer numId, String username, String password, Register[]registros){
        this.name = name;
        this.numId = numId;
        this.username = username;
        this.password = password;
        this.registros = new Register[100];
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumId() {
        return numId;
    }

    public void setNumId(Integer numId) {
        this.numId = numId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void getLogs(Register[] registros) {
        for (int i = 0; i < registros.length ; i++) {
            if (registros[i]==null){
                System.out.println("No hay usuarios registrados");
            } else {
                System.out.println(registros[i]);
            }
        }
    }

    @Override
    public String toString() {
        return ("""
                
                
                
                
                """);
    }
}
