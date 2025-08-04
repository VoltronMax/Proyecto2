package Model;

public class Register {

    private long time;
    private String description;

    Register(String description, long time){
        this.description = description;
        this.time = time;
    }

    public void setTime(Long time){
        this.time = time;
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




}
