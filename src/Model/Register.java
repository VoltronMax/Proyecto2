package Model;

public class Register {

    private String description;
    private User user;
    private Long time;

    Register(String description, User user){
        this.description = description;
        this.time = System.currentTimeMillis();
        this.user = user;
    }

    public Long getTime(){
        return time;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

    public void setUser (User user){
        this.user = user;
    }

    public User getUser(){
        return user;
    }
}
