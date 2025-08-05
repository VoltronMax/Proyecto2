package Model;
import Enums.Roles;

public abstract class User {

    //POJO
    private String name;
    private Integer numId;
    private String username;
    private String password;
    protected Roles rol;
    private Register[]registros;


    User(String name, Integer numId, String username, String password, Roles rol, Register[] registros){
        this.name = name;
        this.numId = numId;
        this.username = username;
        this.password = password;
        this.rol = Roles.ESTANDAR;
        this.registros = new Register[10];
    }

    public Roles getRol(){
        return rol;
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

    @Override
    public String toString() {
        return ("""
                
                
                
                
                """);
    }
}
