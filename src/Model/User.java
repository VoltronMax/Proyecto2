package Model;
import Enums.Roles;

public abstract class User {

    //POJO
    private Register[]registros = new Register[100];
    private String name;
    private Integer numId;
    private String username;
    private String password;
    protected Roles rol;

    User(String name, Integer numId, String username, String password, Roles rol){
        this.name = name;
        this.numId = numId;
        this.username = username;
        this.password = password;
        this.rol = rol;
    }

    public Boolean mostrarRegistros() {
        boolean encontrado = false;
        for(int i=0; i< registros.length; i++){
            if(registros[i]!=null){
                System.out.println(registros[i]);
                encontrado = true;
            }
        }
        return encontrado;
    }

    public Roles getRol(){
        return rol;
    }

    public void setRol(Roles rol){
        this.rol = rol;
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
